package _16_AccessModifiers;

public class Demo {

	public static void main(String[] args) {
		Employee alex = new Employee("Alex");
		alex.setCurrentTask("debugging Java project", 10);
		alex.setHoursLeft(5);
		// System.out.println(alex.getCurrentTaskName());
		// System.out.println(alex.getCurrentTaskHours());
		// System.out.println(alex.getHoursLeft());
		alex.work();

		System.out.println("------------");
		Employee mich = new Employee("Mich");
		mich.setCurrentTask("debugging C# project", 4);
		mich.setHoursLeft(8);
		mich.work();

		System.out.println("------------");
		Employee kim = new Employee("Kim");
		Task cPlusDebug = new Task("debugging C++ project", 6);
		kim.setCurrentTask(cPlusDebug);
		kim.setHoursLeft(6);
		kim.work();

		System.out.println("------------");
		// Employee george = new Employee(""); // exception
		// george.setHoursLeft(-2); // exception
	}

}
