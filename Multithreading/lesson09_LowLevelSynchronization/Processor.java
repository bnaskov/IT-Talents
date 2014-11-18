package lesson09_LowLevelSynchronization;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

	private final int LIMIT = 10;
	private LinkedList<Integer> list = new LinkedList();

	// private Object this = new Object();

	public void produce() throws InterruptedException {

		int value = 0;

		while (true) {
			synchronized (this) {

				while (list.size() == LIMIT) {
					this.wait();
				}

				list.add(value++);
				this.notify();
			}
		}

	}

	public void consume() throws InterruptedException {

		Random random = new Random();

		while (true) {
			synchronized (this) {

				while (list.size() == 0) {
					this.wait();

				}
				System.out.print("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("; value is: " + value);
				this.notify();
			}

			Thread.sleep(random.nextInt(1000));
		}
	}
}
