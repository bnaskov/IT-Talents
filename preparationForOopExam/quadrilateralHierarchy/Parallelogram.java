package preparationForOopExam.quadrilateralHierarchy;

public class Parallelogram extends ConvexQuadrilateral {

	public Parallelogram(double a, double b, double alfa)
			throws IllegalArgumentException {
		super(a, b, a, b, alfa, 180 - alfa, alfa, 180 - alfa);
	}

}
