package preparationForOopExam.quadrilateralHierarchy;

public abstract class Quadrilateral implements IQuadrilateral {
	protected final double a;
	protected final double b;
	protected final double c;
	protected final double d;
	protected final double alfa;
	protected final double beta;
	protected final double gamma;
	protected final double delta;

	protected final double perimeter;
	protected final double area;

	public Quadrilateral(double a, double b, double c, double d, double alfa,
			double beta, double gamma, double delta)
			throws IllegalArgumentException {
		if (a + b + c < d) {
			throw new IllegalArgumentException(
					"The 4 sides you've entered cannot form a quadrilateral.");
		}
		if (a <= 0) {
			throw new IllegalArgumentException(
					"The parameter 'a' cannot be negative or equal to 0.");
		}
		this.a = a;
		if (a <= 0) {
			throw new IllegalArgumentException(
					"The parameter 'b' cannot be negative or equal to 0.");
		}
		this.b = b;
		if (c <= 0) {
			throw new IllegalArgumentException(
					"The parameter 'c' cannot be negative or equal to 0.");
		}
		this.c = c;
		if (a <= 0) {
			throw new IllegalArgumentException(
					"The parameter 'd' cannot be negative or equal to 0.");
		}
		this.d = d;

		if (alfa + beta + gamma + delta != 360) {
			throw new IllegalArgumentException(
					"The sum of all angles must be equal to 360 degrees.");
		}
		if (alfa <= 0 || alfa >= 180) {
			throw new IllegalArgumentException(
					"The parameter 'alfa' cannot be less or equal to 0 or bigger than or equal to 180 degrees.");
		}
		this.alfa = alfa;
		if (beta <= 0 || beta >= 180) {
			throw new IllegalArgumentException(
					"The parameter 'beta' cannot be less or equal to 0 or bigger than or equal to 180 degrees.");
		}
		this.beta = beta;
		if (gamma <= 0 || gamma >= 180) {
			throw new IllegalArgumentException(
					"The parameter 'gamma' cannot be less or equal to 0 or bigger than or equal to 180 degrees.");
		}
		this.gamma = gamma;
		if (delta <= 0 || delta >= 180) {
			throw new IllegalArgumentException(
					"The parameter 'delta' cannot be less or equal to 0 or bigger than or equal to 180 degrees.");
		}
		this.delta = delta;

		this.perimeter = a + b + c + d;
		this.area = calulateArea();
	}

	protected double calulateArea() {
		return -1;
	}
}
