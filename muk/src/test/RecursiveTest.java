package test;

import static org.junit.Assert.*;

import org.junit.Test;
import algo.RecursiveImplention;

public class RecursiveTest {
	RecursiveImplention recursiveImp = new RecursiveImplention();

	@Test
	public void testFactorialWhenZero() {

		// Given
		int a = 0;

		int expected = 1;
		// When
		int actual = recursiveImp.factorial(a);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testFactorialWhenOne() {

		// Given
		int a = 1;

		int expected = 1;
		// When
		int actual = recursiveImp.factorial(a);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testFactorial() {

		// Given
		int a = 4;

		int expected = 24;
		// When
		int actual = recursiveImp.factorial(a);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testPowerWhenExponetZero() {
		// Given
		int base = 2;
		int exponet = 0;

		int expected = 1;
		// When
		int actual = recursiveImp.power(base, exponet);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testPowerWhenExponetOne() {
		// Given
		int base = 4;
		int exponet = 1;

		int expected = 4;
		// When
		int actual = recursiveImp.power(base, exponet);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testPower() {
		// Given
		int base = 3;
		int exponet = 2;

		int expected = 9;
		// When
		int actual = recursiveImp.power(base, exponet);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSumNumbersWhenZero() {
		// Given
		int number = 0;

		int expected = 0;
		// When
		int actual = recursiveImp.sum(number);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSumNumbersWhenOne() {
		// Given
		int number = 1;

		int expected = 1;
		// When
		int actual = recursiveImp.sum(number);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSumNumbersWhenPositive() {
		// Given
		int number = 5;

		int expected = 15;
		// When
		int actual = recursiveImp.sum(number);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSumNumberInArray() {
		// Given
		int number[] = { 1, 3, 6, 4, 7 };

		int expected = 21;
		// When
		int actual = recursiveImp.sum(number);
		// Then
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testSumAverageNumbersInArray() {
		// Given
		int number[] = { 9, 8, 4 };

		double expected = 7.0;
		// When
		double actual = recursiveImp.averageArraySum(number);
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testFibonacciWhenFirstTerm() {
		// given
		int firstTerm = 0;
		int expected = 0;
		// when
		int actual = recursiveImp.fibonacci(firstTerm);
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testFibonacciWhenSecondTerm() {
		// given
		int secondTerm = 1;
		int expected = 1;
		// when
		int actual = recursiveImp.fibonacci(secondTerm);
		// Then
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testFibonacciTest() {
		// given
		int number = 7;
		int expected = 13;
		// when
		int actual = recursiveImp.fibonacci(number);
		// Then
		assertEquals(expected, actual, 0.0001);
	}
}
