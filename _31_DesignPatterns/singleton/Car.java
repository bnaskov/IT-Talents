package _31_DesignPatterns.singleton;

public class Car {

	private static class SingleCar {
		private static final Car CAR = new Car();
	}

	public static Car getCar() {
		return SingleCar.CAR;
	}
}
