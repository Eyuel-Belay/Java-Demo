package algo;

public class MathsUtility implements IUtility{
	
	@Override
	public double add(double first, double second) {
		
		return first+second;
	}

	@Override
	public double subtract(double first, double second) {
		
		return first-second;
	}

	@Override
	public double multiply(double first, double second) {
		
		return first* second;
	}

	@Override
	public double divide(double first, double second) {
		if(second==0)
		 throw new IllegalArgumentException("Argument 'divisor' is 0");

		return first/second;
	}

	@Override
	public double absolute(double first) {
		if(first < 0) return -first;
		else
		return first;
	}
}
