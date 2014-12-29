package _15_MethodsAndConstructors;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer computer1 = new Computer(1990, 2000.01, false, 1012.05, 1000,
				"iOS");
		Computer computer2 = new Computer(2012, 1800, 2048.01, 512);
		Computer computer3 = new Computer();
		Computer computer4 = new Computer(2010, 1800, 2048.01, 1012);

		System.out.println(computer1.comparePrice(computer2));

		Computer.compareComputerPrice(computer1, computer2);
		Computer.compareComputerPrice(computer3, computer2);
		Computer.compareComputerPrice(computer2, computer4);
	}
}
