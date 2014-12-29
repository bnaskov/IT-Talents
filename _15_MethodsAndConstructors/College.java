package _15_MethodsAndConstructors;

public class College {

	public static void main(String[] args) {
		Student pesho = new Student("Pesho", "IT", 30);
		Student gosho = new Student("Gosho", "IT", 23);
		Student tencho = new Student("Tencho", "IT", 24);
		Student mony = new Student("Mony", "Economics", 32);
		Student ivan = new Student("Ivan", "IT", 25);
		Student dragan = new Student("Dragan", "IT", 25);
		Student petkan = new Student("Petakan", "IT", 25);
		Student tosho = new Student("Tosho", "Economics", 23);
		Student vesko = new Student("Vesko", "Economics", 25);

		System.out.println(pesho.receiveScholarship(4, 200)); // doesn't receive
																// a
																// scholarship,
																// because he is
																// over 29
		System.out.println(gosho.receiveScholarship(4, 200));
		System.out.println("------------------------");

		System.out.println(pesho.getStudentYearInCollege()); // 1
		pesho.upYear();
		System.out.println(pesho.getStudentYearInCollege()); // 2
		System.out.println("------------------------");

		StudentGroup it = new StudentGroup("IT"); // creates a new StudentGroup
													// "IT"
		it.addStudent(pesho);
		it.addStudent(gosho);
		it.addStudent(tencho);
		it.addStudent(vesko); // cannot add student with different subject
		it.addStudent(ivan);
		it.addStudent(dragan);
		it.addStudent(petkan); // There are no more free places!
		System.out.println("------------------------");
		it.printStudentsInGroup();
		System.out.println("------------------------");
		gosho.setStudentGrade(7); // invalid grade
		gosho.setStudentGrade(5);
		System.out.println(gosho.getStudentGrade()); // Gosho's new grade is 5
		it.theBestStudent(); // Gosho is the student with the highest grade
		System.out.println("------------------------");

		StudentGroup economics = new StudentGroup("Economics"); // creates new
																// StudentGroup
																// "Economics"
		economics.addStudent(vesko);
		economics.addStudent(tosho);
		economics.printStudentsInGroup();
		economics.emptyGroup(); // empties the group
		economics.printStudentsInGroup(); // prints nothing the group is empty
		System.out.println("------------------------");

		mony.upYear(); // second year
		mony.upYear(); // third year
		mony.upYear(); // fourth year
		System.out.println(mony.getStudentYearInCollege());
		mony.upYear(); // The student have already graduated!
		economics.addStudent(mony); // you cannot add a student to the group if
									// he has a degree
	}
}
