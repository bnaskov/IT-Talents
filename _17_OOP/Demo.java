package _17_OOP;

public class Demo {

	public static void main(String[] args) {
		Person[] persons = new Person[10];

		Person jim = new Person("Jim", 21, true);
		Person jack = new Person("Jack", 29, true);
		Student jill = new Student("Jill", 20, false, 5.80);
		Student ross = new Student("Ross", 22, true, 5.42);
		Employee monika = new Employee("Monika", 32, false, 24);
		Employee rick = new Employee("Rick", 17, true, 28.80);

		persons[0] = jim;
		persons[1] = jack;
		persons[2] = jill;
		persons[3] = ross;
		persons[4] = monika;
		persons[5] = rick;

		for (Person person : persons) {
			if (person != null) {
				if (person.getClass().getSimpleName().equals("Person")) {
					person.showPersonInfo();
				}
				if (person.getClass().getSimpleName().equals("Student")) {
					((Student) person).showStudentInfo();
				}
				if (person.getClass().getSimpleName().equals("Employee")) {
					((Employee) person).showEmployeeInfo();
				}
			}
		}
		System.out.println();

		for (Person person : persons) {
			if (person != null) {
				if (person.getClass().getSimpleName().equals("Employee")) {
					System.out.print(person.getName()
							+ "'s overtime payment wоuld be: ");
					System.out
							.println(((Employee) person).calculateOvertime(2));
				}
			}
		}
		System.out.println();

		// You can either create an empty constructor in class Person, or you
		// can create a constructor in class Student with default values for
		// name, age, isMale
		Student joe = new Student();
		joe.showStudentInfo();
	}

}
