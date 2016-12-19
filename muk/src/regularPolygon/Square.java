package regularPolygon;

public class Square implements IRegularPolygon{
	
	private final int numberOfSide;
	
	private double sideLength;
	/**
	 * Accept  valid side of a Square
	 * @param sideLength-side of a Square
	 * @throws IllegalArgumentException if side is NEGATIVE
	 */
	public Square(double sideLength){
		
		if(sideLength < 0)
			throw new IllegalArgumentException("Negative number is not allowed");
		
		this.sideLength=sideLength;
		this.numberOfSide=4;
		
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
    * Get Perimeter of a Square-numberOfSide*sideLength ;
    * @return perimeter of a square
    */
	@Override
	public double getPerimeter() {
		
		return numberOfSide*sideLength ;
	}
   /**
    * Get the area of Square-sideLength * sideLength
    * @return area of square
    */
	@Override
	public double getArea() {
		
		return sideLength * sideLength;
	}
	@Override
	public String toString(){
		return "Area of Sqare"+getArea()+",Perimeter of Sqare"+getPerimeter();
	}
}
