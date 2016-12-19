package algo;

public class RecursiveImplention implements IRecursive {

	@Override
	public int factorial(int n) {

		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	@Override
	public int power(int base, int exponent) {

		if (exponent == 0)
			return 1;
		else if (exponent == 1)
			return base;
		else
			return base * power(base, exponent - 1);
	}

	@Override
	public int sum(int number) {

		if (number == 0)
			return 0;
		else if (number == 1)
			return 1;
		else
			return number + sum(number - 1);
	}

	@Override
	public int sum(int[] num) {

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	@Override
	public int fibonacci(int number) {

		if (number == 0)
			return 0;
		else if (number == 1)
			return 1;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public double averageArraySum(int[] number) {

		int sum = 0;
		int length = number.length;
		for (int i = 0; i < length; i++) {
			sum += number[i];
		}
		return sum / length;
	}

}
