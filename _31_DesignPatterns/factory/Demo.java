package _31_DesignPatterns.factory;

public class Demo {

	public static void main(String[] args) {
		SlaughterHouse sl = SlaughterHouse.getInstance();

		IMeatProduct meat = sl.produceFood(IMeatProduct.Type.STEAK, 20);
		System.out.println(meat);

	}

}
