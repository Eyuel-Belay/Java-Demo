package regularPolygon;

public class EquilateralTriangle implements IRegularPolygon{

    private final int numberOfSide;
	
	private double sideLength;
	/**
	 * Accept  valid side of an EquilateralTriangle
	 * @param sideLength-side of an  EquilateralTriangle
	 * @throws IllegalArgumentException if side is NEGATIVE
	 */
    public EquilateralTriangle(double sideLength){
		
		if(sideLength < 0)
			throw new IllegalArgumentException("Negative number is not allowed");
		
		this.sideLength=sideLength;
		this.numberOfSide=3;
	}
	@Override
	public int NumberOfSides() {
		
		return numberOfSide;
	}

	@Override
	public double SideLength() {
		
		return sideLength;
	}
	/**
     * Get the perimeter of an EquilateralTriangle-numberOfSide*sideLength;
     * @return perimeter of an EquilateralTriangle
     */
	@Override
	public double getPerimeter() {
		
		return numberOfSide*sideLength;
	}
    /**
     * Get the area of an EquilateralTriangle-sideLength * sideLength * Math.sqrt(3) / 4;
     * @return area of an EquilateralTriangle
     */
	@Override
	public double getArea() {
		
		return sideLength * sideLength * Math.sqrt(3) / 4;

	}
	@Override
	public String toString(){
		return "Area of EquilateralTriangle"+getArea()+",Perimeter of EquilateralTriangle"+getPerimeter();
	}
}
