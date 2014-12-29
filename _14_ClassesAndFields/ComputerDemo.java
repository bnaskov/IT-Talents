package _14_ClassesAndFields;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer computer1 = new Computer(2013, 1099.99, false, 1024, 824.5,
				"Linux");
		Computer computer2 = new Computer(2014, 2799.90, true, 2048, 1256.5,
				"Windows");

		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
		System.out.println("-----------------------");

		computer1.useMemory(100);
		computer2.changeOperationSystem("Ubuntu");

		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
	}

}
