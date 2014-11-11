package _30_Concurrency.guardedLock;

public class Transporter extends Thread {
	Factory f;

	public Transporter(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			f.move(String.valueOf(i));
			try {
				System.out.println("Product moved to  " + i + " location");
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
