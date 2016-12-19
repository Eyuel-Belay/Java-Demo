package regularPolygon;


public class RegPolygonFactory {
	//Create instance of an object based on the type of shape 
    public IRegularPolygon getShape(String shapeType, double sideLength)
    {
        return getShape(shapeType, sideLength, 0.0);
    }
    public IRegularPolygon getShape(String shapeType, double sideLength, double apothem)
    {
        if (shapeType == null) throw new IllegalArgumentException("shapeType");
        if (sideLength < 0.0) throw new IndexOutOfBoundsException("Wrong Side of length");
        if (apothem < 0.0) throw new IndexOutOfBoundsException("Wrong Apothem");
        else if (shapeType.equals("SQUARE"))
        {
            return new Square(sideLength);
        }
        else if (shapeType.equals("EQUILATERALTRIANGLE"))
        {
            return new EquilateralTriangle(sideLength);
        }
        //shapeType.equalsIgnoreCase("REGULARPENTAGON")
        else if (shapeType.equals("REGULARPENTAGON"))
        {
            return new RegularPentagon(sideLength, apothem);
        }
        return null;
    }
}
