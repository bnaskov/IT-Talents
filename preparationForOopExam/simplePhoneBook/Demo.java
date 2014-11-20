package preparationForOopExam.simplePhoneBook;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person ivan = new Person("Ivan", "0886 340 380");
		Person george = new Person("George", "0888 310 100");
		SimplePhoneBook simplePhoneBook = new SimplePhoneBook();
		simplePhoneBook.addPerson(ivan);
		simplePhoneBook.addPerson(george);

		for (Person person : simplePhoneBook.people) {
			System.out.println(person.getId());
		}

		String command = "";
		String name = "";
		String phone = "";
		while (true) {
			System.out.println("Please select action (N, R, L, Q)");
			command = scanner.nextLine();
			switch (command) {
			case "N":
				System.out.println("Name: ");
				name = scanner.nextLine();
				System.out.println("Phone: ");
				phone = scanner.nextLine();
				Person person = new Person(name, phone);
				simplePhoneBook.addPerson(person);
				System.out.printf("New record with ID %d has been created!%n",
						person.getId());
				break;
			default:
				System.out.println("Invalid command.");
				break;
			}
			for (Person person : simplePhoneBook.people) {
				System.out.println(person.toString());
			}

		}

	}
}
