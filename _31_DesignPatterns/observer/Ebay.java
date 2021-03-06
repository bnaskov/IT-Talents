package _31_DesignPatterns.observer;

import _31_DesignPatterns.observer.CarFactory.ICarFactoryObserver;

public class Ebay implements ICarFactoryObserver {

	@Override
	public void carProduced(int id) {
		// do whatever you need to do when a new car is produced
		System.out
				.println("eBay: There is a new product in the factory with id: "
						+ id);
	}
}
