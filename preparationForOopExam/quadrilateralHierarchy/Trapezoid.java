package preparationForOopExam.quadrilateralHierarchy;

public class Trapezoid extends ConvexQuadrilateral {
	public Trapezoid(double a, double b, double c, double d, double alfa,
			double beta, double gamma, double delta)
			throws IllegalArgumentException {
		super(a, b, c, d, alfa, beta, gamma, delta);

		if (alfa + gamma != 180) {
			throw new IllegalArgumentException(
					"The values of the angles you've entered are invalid: (alfa + gamma) = (beta + delta) = 180 degrees");
		}

	}
}
