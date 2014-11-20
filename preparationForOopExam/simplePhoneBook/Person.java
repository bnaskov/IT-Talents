package preparationForOopExam.simplePhoneBook;

public class Person {
	private static int id = 1;
	private int uniqueId;
	private String name;
	private String phone;

	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.uniqueId = id;
		id++;
	}

	public int getId() {
		return this.uniqueId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.phone;
	}
}
