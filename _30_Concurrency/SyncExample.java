package _30_Concurrency;

public class SyncExample {

	private synchronized static void printSomeStuff() {
		try {
			System.out.print("[");
			Thread.sleep(200);
			System.out.print(Thread.currentThread().getName());
			Thread.sleep(200);
			System.out.print("]");
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				printSomeStuff();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				printSomeStuff();
			}
		});
		t2.start();
		t1.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printSomeStuff();
	}
}
