package preparationForOopExam.agriculture;

public class Demo {

	public static void main(String[] args) {
		try {
			Area areaA = new Area(100, AgriculturalType.FRUITS, 6000);
			Worker ivan = new Worker("Ivan", "w1235", 30, 40);
			Worker peter = new SpecializedWorker("Peter", "sw98", 50, 60,
					AgriculturalType.VEGETABLES);
			// Id is already taken.
			// Worker moni = new Worker("Moni", "w1235", 20, 10);
			Worker jon = new Worker("Jon", "w24", 30, 40);
			System.out.println(ivan.doWork(areaA));
			System.out.println(areaA.getAmount());
			System.out.println(peter.doWork(areaA, true));
			System.out.println(areaA.getAmount());
		} catch (AreaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
