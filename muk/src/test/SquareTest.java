package test;

import static org.junit.Assert.*;

import org.junit.Test;

import regularPolygon.IRegularPolygon;
import regularPolygon.RegPolygonFactory;


public class SquareTest {
	
	private final String NAN = "Negative number is not allowed";
	
	RegPolygonFactory regularPolygon = new RegPolygonFactory();
	
	@Test
	// Test the Area Of Square with valid input(side=4)
	public void testAreaOfSquare_ValidArgument() {
		// Given
		double sideLength = 4;
		IRegularPolygon square = regularPolygon.getShape("SQUARE", sideLength);
		double expected = 16;
		// when
		double actual = square.getArea();
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testAreaOfSquare_InValidArgument() {
		// Given
		double sideLength = -6;
		IRegularPolygon square = regularPolygon.getShape("SQUARE", sideLength);
		String expected = NAN;
		// when
		double actual = square.getArea();
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testPerimeterOfSquareWhenZero() {
		// Given
		double sideLength = 0;
		IRegularPolygon square = regularPolygon.getShape("SQUARE", sideLength);
		double expected = 0;
		// when
		double actual = square.getPerimeter();
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testPerimeterOfSquare_InValidArgument() {
		// Given
		double sideLength = -6;
		IRegularPolygon square = regularPolygon.getShape("SQUARE", sideLength);
		String expected = NAN;
		// when
		double actual = square.getPerimeter();
		// Then
		assertEquals(expected, actual);
	}
    @Test
    public void testToStringSquare(){
    	//Given 
    	double sideLength=5;
    	IRegularPolygon square = regularPolygon.getShape("SQUARE", sideLength);
    	String expected= "Area of Sqare"+25.0+",Perimeter of Sqare"+20.0;
    	//when 
    	String actual=square.toString();
    	//Then
    	assertEquals(expected, actual);
    }
}
