package _17_OOP;

public class Student extends Person {
	private double score;

	public Student() {

	}

	// public Student() {
	// super("Joe", 18, true);
	// }

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	protected double getScore() {
		return this.score;
	}

	protected void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			throw new IllegalArgumentException(
					"The score must be in the interval [2..6]");
		}
	}

	protected void showStudentInfo() {
		System.out.printf("Name: %s, age: %d, isMale: %b, score: %.2f%n",
				this.getName(), this.getAge(), this.isMale(), this.getScore());
	}
}
