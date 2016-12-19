package test;

import static org.junit.Assert.*;

import org.junit.Test;

import regularPolygon.IRegularPolygon;
import regularPolygon.RegPolygonFactory;


public class EquilateralTriangleTest {

     private final String NAN = "Negative number is not allowed";
	
	RegPolygonFactory regularPolygon = new RegPolygonFactory();
	
		
	@Test
	// Test the Area Of an Equilateral Triangle with valid input(side=4)
	public void testAreaOfEquilateralTriangle_ValidArgument() {
		// Given
		double sideLength = 5;
		IRegularPolygon equilateralTriangle = regularPolygon.getShape("EQUILATERALTRIANGLE", sideLength);
		double expected = 10.825317;
		// when
		double actual = equilateralTriangle.getArea();
		// Then
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void testAreaOfEquilateralTriangle_InValidArgument() {
		// Given
		double sideLength = -6;
		IRegularPolygon equilateralTriangle = regularPolygon.getShape("EQUILATERALTRIANGLE", sideLength);
		String expected = NAN;
		// when
		double actual = equilateralTriangle.getArea();
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testPerimeterOfEquilateralTriangleWhenZero() {
		// Given
		double sideLength = 0;
		IRegularPolygon equilateralTriangle = regularPolygon.getShape("EQUILATERALTRIANGLE", sideLength);
		double expected = 0;
		// when
		double actual = equilateralTriangle.getPerimeter();
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testPerimeterOfEquilateralTriangle_InValidArgument() {
		// Given
		double sideLength = -6;
		IRegularPolygon equilateralTriangle = regularPolygon.getShape("EQUILATERALTRIANGLE", sideLength);
		String expected = NAN;
		// when
		double actual = equilateralTriangle.getPerimeter();
		// Then
		assertEquals(expected, actual);
	}
    @Test
    public void testToStringSquare(){
    	//Given 
    	double sideLength=5;
    	IRegularPolygon equilateralTriangle = regularPolygon.getShape("EQUILATERALTRIANGLE", sideLength);
    	String expected= "Area of EquilateralTriangle"+10.825317547305483+",Perimeter of EquilateralTriangle"+15.0;
    	//when 
    	String actual=equilateralTriangle.toString();
    	//Then
    	assertEquals(expected, actual);
    }
}
