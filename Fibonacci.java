/*
Fibonacci serie - defined by array 10 elements; program can show a
selected number of serie for example position three: 1
*/

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	
	int fibonacciSeries[] = {0,1,1,2,3,5,8,13,21,34};
	
	System.out.println("write a number in serie (1...10): ");
	Scanner input = new Scanner(System.in);
	
	int intUserInput = input.nextInt();
	int serieArrayNumber = intUserInput - 1;
	
<<<<<<< HEAD
	System.out.print("value of " + intUserInput + " fibonacci serie: ");
	System.out.println(fibonacciSeries[serieArrayNumber]);
=======
	System.out.print("value of " + intUserInput + " fibonacci series: ");
	System.out.println(fibonacciSeries[intUserInput]);
>>>>>>> b19b568015adb4b7f9b927a8d1bfa26f5ce7a0e9
	}
}
