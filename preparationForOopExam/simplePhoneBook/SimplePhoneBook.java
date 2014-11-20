package preparationForOopExam.simplePhoneBook;

import java.util.ArrayList;

public class SimplePhoneBook {
	ArrayList<Person> people = new ArrayList<Person>();

	public void addPerson(Person person) {
		if (person == null) {
			throw new IllegalArgumentException("Person cannot be null.");
		}

		this.people.add(person);
	}
}
