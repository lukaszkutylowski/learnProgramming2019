/*
Function catch value of variables and realized print of fibonacci series number
*/

import java.util.Scanner;

public class Function {
	
	int fibonacciSeries[] = {0,1,1,2,3,5,8,13,21,34};
	private int localIntUserInput;
	private int serieArrayNumber;
	private int var;

	public void setInput(int intUserInput) {
		localIntUserInput = intUserInput;
		serieArrayNumber = localIntUserInput - 1;
	}

	public void getInput() {
		System.out.print("value of "+localIntUserInput+" fibonacci serie: ");
		System.out.println(fibonacciSeries[serieArrayNumber]);
	}
}
