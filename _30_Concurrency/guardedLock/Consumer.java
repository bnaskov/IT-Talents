package _30_Concurrency.guardedLock;

public class Consumer extends Thread {
	Factory f;

	public Consumer(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int prodNo = f.getProductNo();
			try {
				sleep(200);
			} catch (InterruptedException e) {}
			System.out.println("Consumer took product " + prodNo);
		}
	}
}
