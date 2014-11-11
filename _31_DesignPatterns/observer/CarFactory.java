package _31_DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	public static interface ICarFactoryObserver {
		public void carProduced(int id);
	}

	private int carId = -1;
	private List<ICarFactoryObserver> observers = new ArrayList();

	public void setProductId(int newId) {
		this.carId = newId;
		this.notifyFactoryObserver(newId);
	}

	public void regFactoryObserver(ICarFactoryObserver fo) {
		observers.add(fo);
	}

	void removeFactoryObserver(ICarFactoryObserver fo) {
		observers.remove(fo);
	}

	void notifyFactoryObserver(int newId) {
		for (ICarFactoryObserver fo : observers) {
			fo.carProduced(newId);
		}
	}
}
