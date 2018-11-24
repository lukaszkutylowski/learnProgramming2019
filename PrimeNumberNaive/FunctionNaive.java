/*
program realized naive test of Prime Number
*/

public class FunctionNaive {
	
	private double startValue = 2;
	private double result=0;
	private double number;
	private double copyResult;
	private double floorDoubleResult;
	private int floorResult;

	public void setFunction(double num) {
		number = num;
	}

	public void getFunction() {
	while(result <= (number - 1)) {
		result = number / startValue;
		copyResult = result;
		floorDoubleResult = Math.floor(copyResult);
		floorResult = (int) floorDoubleResult;
		
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
