package lesson01to03_Multithreading;

class Dog extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("bark" + i);
		}
	}
}

class Cat implements Runnable {
	private void meow() {
		System.out.println("meow");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			this.meow();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class StartingThreads {

	public static void main(String[] args) {
		Dog sharo = new Dog();
		Dog rich = new Dog();
		Thread mery = new Thread(new Cat());
		Thread bary = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("blob");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		sharo.start();
		rich.start();
		mery.start();
		bary.start();
	}

}
