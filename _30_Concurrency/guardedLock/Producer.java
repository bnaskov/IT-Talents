package _30_Concurrency.guardedLock;

public class Producer extends Thread{

	Factory factory;
	public Producer(Factory f) {
		factory = f;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			factory.setProductNo(i);
			try {
				System.out.println("Product " + i + " produced");
				sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
