package preparationForOopExam.quadrilateralHierarchy;

public class ConvexQuadrilateral extends Quadrilateral {
	public ConvexQuadrilateral(double a, double b, double c, double d,
			double alfa, double beta, double gamma, double delta)
			throws IllegalArgumentException {
		super(a, b, c, d, alfa, beta, gamma, delta);
	}

	@Override
	protected double calulateArea() {
		double area = this.a * this.b * Math.sin(Math.toRadians(this.beta)) / 2
				+ this.c * this.d * Math.sin(Math.toRadians(this.delta)) / 2;
		return area;
	}

	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	@Override
	public double getArea() {
		return this.area;
	}

}
