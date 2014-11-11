package _31_DesignPatterns.observer;

import _31_DesignPatterns.observer.CarFactory.ICarFactoryObserver;

public class Demo {

	public static void main(String[] args) {
		CarFactory porsche = new CarFactory();

		Ebay ebay = new Ebay();
		A1 a1 = new A1();
		porsche.regFactoryObserver(ebay);
		porsche.regFactoryObserver(a1);

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			porsche.setProductId(i + 1);
			if (i == 2) {
				goOutOfBusiness(porsche, ebay);

			}
		}
	}

	private static void goOutOfBusiness(CarFactory carFactory,
			ICarFactoryObserver shop) {
		carFactory.removeFactoryObserver(shop);
	}

}
