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

		if(copyResult == floorResult) {
			System.out.println("Liczba nie jest pierwsza");
			result = number + 1;
		}
		else
		startValue++;
		
		if(startValue == (number - 1)) {
			System.out.println("Liczba jest pierwsza");
			result = number + 1;
		}
	}
	
	
}
}
