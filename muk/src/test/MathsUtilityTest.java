package test;

import static org.junit.Assert.*;

import org.junit.Test;

import algo.MathsUtility;

public class MathsUtilityTest {
	MathsUtility mathsUtil = new MathsUtility();
	public final String NAN = "UNDEFINED";

	@Test
	public void testAddDouble() {
		// Given
		double first = 0.0;
		double second = 0.0;
		double expected = 0;
		// When
		double actual = mathsUtil.add(first, second);
		// Then
		assertEquals(expected, actual, 0.00001);

	}

	@Test
	public void testMuliplyDouble() {
		// Given
		double first = 0.0;
		double second = 0.0;
		double expected = 0;
		// When
		double actual = mathsUtil.multiply(first, second);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testDifferenceDouble() {
		// Given
		double first = 5.0;
		double second = 7.4;
		double expected = -2.4;
		// When
		double actual = mathsUtil.subtract(first, second);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testDifferenceDoubleNegative() {
		// Given
		double first = 5.0;
		double second = -7.4;
		double expected = 12.4;
		// When
		double actual = mathsUtil.subtract(first, second);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testDivisionDoubleCorrectArgument() {
		// Given
		double first = 4.0;
		double second = 2.0;
		double expected = 2.0;
		// When
		double actual = mathsUtil.multiply(first, second);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testPositiveAbsoluteValue() {
		// Given
		double first = 4.0;
		double expected = 4.0;
		// When
		double actual = mathsUtil.absolute(first);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testNegativeAbsoluteValue() {
		// Given
		double first = -5.0;
		double expected = 5.0;
		// When
		double actual = mathsUtil.absolute(first);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

}
