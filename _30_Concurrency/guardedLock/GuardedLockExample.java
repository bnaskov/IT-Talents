package _30_Concurrency.guardedLock;

public class GuardedLockExample {

	public static void main(String[] args) {
		Factory myFactory = new Factory();
		Producer p = new Producer(myFactory);
		p.start();

		Transporter t = new Transporter(myFactory);
		t.start();

		Consumer c = new Consumer(myFactory);
		c.start();
	}
}
