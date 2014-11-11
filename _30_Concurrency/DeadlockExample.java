package _30_Concurrency;

public class DeadlockExample {
	private static A a = new A();
	private static B b = new B();
	private static Object c = new Object();

	private static class A {
		void begin() {
			synchronized (c) {
				System.out.println("Begin printing from "
						+ Thread.currentThread().getName());
				b.end();
			}

		}

		void end() {
			synchronized (c) {
				System.out.println("End printing from "
						+ Thread.currentThread().getName());
			}

		}

	}

	private static class B {
		void begin() {
			synchronized (c) {
				System.out.println("Begin printing from "
						+ Thread.currentThread().getName());
				a.end();
			}

		}

		void end() {
			synchronized (c) {
				System.out.println("End printing from "
						+ Thread.currentThread().getName());
			}

		}

	}

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				a.begin();

			}
		});

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				b.begin();
			}
		});

		t.start();
		t1.start();
	}

}
