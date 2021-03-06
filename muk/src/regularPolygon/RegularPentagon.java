package regularPolygon;

public class RegularPentagon implements IRegularPolygon{
    
    private final int numberOfSide;
	
	private double sideLength;
	
	private double apothem;
	/**
	 * 
	 * @param sideLength-Length of a side of a RegularPentagon,double
	 * @param apothem- Apothem of a side of a RegularPentagon,double
	 * @throws IllegalArgumentException if either side of a length or apothem zero
	 */
	public RegularPentagon(double sideLength,double apothem){
		if(sideLength < 0.0 || apothem < 0.0)
			throw new IllegalArgumentException("Negative number is not allowed");
		
		this.sideLength=sideLength;
		this.apothem=apothem;
		this.numberOfSide=5;
		
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
    * Get Perimeter of RegularPentagon-double
    */
	@Override
	public double getPerimeter() {
		
		return numberOfSide*sideLength;
	}
   /**
    * Get Area of of RegularPentagon-double
    */
	@Override
	public double getArea() {
		
		return 2.5 * sideLength * apothem;
	}
	@Override
	public String toString(){
		return "[ Area of RegularPentagon "+ getArea()+" , Perimeter of RegularPentagon "+ getPerimeter()+"]";
	}
}
