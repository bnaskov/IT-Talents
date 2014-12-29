package _15_MethodsAndConstructors;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	public String getGroupSubject() {
		return this.groupSubject;
	}

	public void addStudent(Student s) {
		if (this.freePlaces > 0
				&& this.getGroupSubject().equals(s.getStudentSubject())
				&& s.getStudentName() != null && !s.HasADegree()) {
			this.students[5 - this.freePlaces] = s;
			this.freePlaces--;
		} else if (this.freePlaces < 1) {
			System.out.println("There are no more vacant places in the group!");
		} else if (this.groupSubject != s.getStudentSubject()) {
			System.out.println(s.getStudentName()
					+ "'s subject is different from group's subject!");
		} else if (s.HasADegree()) {
			System.out
					.println(s.getStudentName()
							+ " had already gradueted, you cannot add him to the group!");
		} else {
			System.out
					.println("The student doesn't have a name. Please fill the missing information!");
		}
	}

	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public void theBestStudent() {
		double maxGrade = 0;
		String nameOfBestStudentString = "";
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] != null && students[i].getStudentGrade() > maxGrade) {
				nameOfBestStudentString = students[i].getStudentName();
				maxGrade = students[i].getStudentGrade();
			}
		}
		System.out.println("The student with the highest grade is: "
				+ nameOfBestStudentString);
	}

	public void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i].toString());
			}
		}
	}
}
