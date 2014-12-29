package _15_MethodsAndConstructors;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private byte yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		if (age < 0) {
			throw new IllegalArgumentException("Age must be a positive number!");
		} else {
			this.age = age;
		}
	}

	// getters and setters
	public String getStudentName() {
		return this.name;
	}

	public void setStudentName(String name) {
		this.name = name;
	}

	public String getStudentSubject() {
		return this.subject;
	}

	public double getStudentGrade() {
		return this.grade;
	}

	public boolean HasADegree() {
		return this.isDegree;
	}

	public int getStudentYearInCollege() {
		return this.yearInCollege;
	}

	public void setStudentGrade(double grade) {
		if (grade > 6 || grade < 2) {
			System.out.println("Invalid grade!");
		} else {
			this.grade = grade;
		}
	}

	public void upYear() {
		if (!this.isDegree) {
			this.yearInCollege++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
				this.yearInCollege = 4;
			}
		} else {
			System.out.println("The student have already graduated!");
		}
	}

	public double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}

	public String toString() {
		return "Name: " + this.name + "; Subject: " + this.subject
				+ "; Grade: " + this.grade + "; Year in college: "
				+ this.yearInCollege + "; Age: " + this.age
				+ "; Have a degree: " + this.isDegree + "; Money: "
				+ this.money + ".";
	}
}
