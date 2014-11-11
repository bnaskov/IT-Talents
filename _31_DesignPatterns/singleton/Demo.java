package _31_DesignPatterns.singleton;

public class Demo {

	public static void main(String[] args) {
		Car car1 = Car.getCar();
		Car car2 = Car.getCar();

		System.out.println(car1.equals(car2));
	}
}
