/*
program realized naive test of Prime Number
*/

public class FunctionNaive {
	
	private long startValue = 2;
	private long result=0;
	private long number;
	private long copyResult;
	private long floorResult;

	public void setFunction(long num) {
		number = num;
	}

	public void getFunction() {
	while(result <= (number - 1)) {
		result = number / startValue;
		copyResult = result;
		floorResult = (long) Math.floor(copyResult);
		
		if(startValue == (number - 1)) {
			System.out.println("YES it is a prime number");
			result = number + 1;
		}
		
		if(copyResult == floorResult) {
			System.out.println("Number is NOT a prime number");
			result = number + 1;
		}
		else
		startValue++;
	}
	
	
}
}
