/*
Fibonacci serie - defined by array 10 elements; program can show a selected number of serie for example position three: 1
*/

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	
	int fibonacciSeries[] = {0,1,1,2,3,5,8,13,21,34};
	
	System.out.println("write a number in serie (0...9): ");
	Scanner input = new Scanner(System.in);
	
	String userInput = input.nextLine();
	int intUserInput = Integer.parseInt(userInput);
	
	System.out.print("value of " + intUserInput + " fibonacci series: ");
	System.out.println(fibonacciSeries[intUserInput]);
	}
}
