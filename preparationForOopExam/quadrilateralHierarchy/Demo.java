package preparationForOopExam.quadrilateralHierarchy;

public class Demo {

	public static void main(String[] args) {
		try {
			Quadrilateral[] quadrilaterals = new Quadrilateral[] {
					new ConvexQuadrilateral(10, 5, 12, 3, 120, 80, 60, 200),
					new Trapezoid(10, 4, 5, 6, 60, 50, 120, 130),
					new Parallelogram(5, 6, 60), new Rectangle(4, 3),
					new Rhombus(4, 30), new Square(2) };

			for (Quadrilateral quadrilateral : quadrilaterals) {
				System.out.printf("%s - perimeter: %.2f, area: %.2f%n",
						quadrilateral.getClass().getSimpleName(),
						quadrilateral.getPerimeter(), quadrilateral.getArea());
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
