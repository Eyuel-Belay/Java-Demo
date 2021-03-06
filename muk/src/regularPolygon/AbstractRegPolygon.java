package regularPolygon;

public abstract class AbstractRegPolygon {
 
	private int numberOfSide;
	private double sideLength;

	public AbstractRegPolygon(int numberOfSide, double sideLength) {
		this.numberOfSide = numberOfSide;
		this.sideLength = sideLength;
	}

	int NumberOfSides() {
		return numberOfSide;
	}

	double SideLength() {
		return sideLength;
	}

	public double getPerimeter() {
		return numberOfSide * sideLength;
	}

	public abstract double getArea();
}
