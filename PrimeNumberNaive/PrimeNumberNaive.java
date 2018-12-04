/*
program calculate of prime number (2...n) when 'n' is input from user
*/

import java.util.Scanner;

public class PrimeNumberNaive {
	
	public static void main(String[] args) {
	
	System.out.print("please enter of 'n' number of range (2...n): ");
	Scanner input = new Scanner(System.in);
	
	long n = input.nextLong();
	
	FunctionNaive sendN = new FunctionNaive();
	sendN.setFunction(n);
	sendN.getFunction();
	}
}
