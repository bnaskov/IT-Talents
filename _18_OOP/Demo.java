package _18_OOP;

public class Demo {

	public static void main(String[] args) {
		Person[] persons = new Person[10];

		Student jill = new Student("Jill", 20, false, 5.80);
		Student ross = new Student("Ross", 22, true, 5.42);
		Employee monika = new Employee("Monika", 32, false, 24);
		Employee rick = new Employee("Rick", 17, true, 28.80);

		persons[0] = jill;
		persons[1] = ross;
		persons[2] = monika;
		persons[3] = rick;

		for (Person person : persons) {
			if (person != null) {
				person.getInfo();
			}
		}

		for (Person person : persons) {
			if (person instanceof Employee) {
				System.out.print("Overtime payment: ");
				System.out.println(((Employee) person).calculateOvertime(2));
			}
		}
	}
}
