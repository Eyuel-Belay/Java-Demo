package algo;

import static org.junit.Assert.fail;

public class RecursiveImplention implements IRecursive {

	@Override
	public int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n*factorial(n-1);
	}

	@Override
	public int power(int base, int exponent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int[] num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fibonacci(int first, int second) {
		// TODO Auto-generated method stub
		return 0;
	}

}
