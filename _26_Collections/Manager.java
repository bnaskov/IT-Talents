package _26_Collections;

public class Manager extends Employee {
	public enum Title {
		CFO, CTO, CEO, PM, CMO
	};

	private Title title;

	public Manager(String name, int age, double salary, String id, Title title) {
		super(name, age, salary, id);
		this.setTitle(title);
	}

	public Title getTitle() {
		return this.title;
	}

	private void setTitle(Title title) {
		if (title == null) {
			throw new NullPointerException("Invalid manager title.");
		}

		this.title = title;
	}

}
