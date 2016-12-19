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
}
