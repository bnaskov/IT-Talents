package lesson1to3_Multithreading;

import java.util.Scanner;

class Processor extends Thread {
	// guaranteed to work on all systems, running is not cached
	// volatile prevent threads caching variables
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("hello...");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		this.running = false;
	}
}

public class BasicThreadSynchronization {

	public static void main(String[] args) {

		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press return key to stop.");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		proc1.shutdown();
	}

}
