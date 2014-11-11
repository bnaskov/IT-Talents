package _30_Concurrency.guardedLock;

public class Factory {
	private int productNo = -1;
	private boolean productDone = false;
	private boolean productMoved = false;
	private String location;

	synchronized void setProductNo(int no) {
		while (productDone) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.productNo = no;
		productDone = true;
		notifyAll();
	}

	synchronized void move(String location) {
		while (!productDone) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.location = location;
		productMoved = true;
		productDone = false;
		notifyAll();
	}

	synchronized int getProductNo() {
		while (!productMoved)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		productMoved = false;
		notifyAll();
		return this.productNo;
	}
}
