/*
Fibonacci serie - defined by array 10 elements; program send values of variables to Function class; program can show a
selected number of serie for example position three: 1
*/

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	
	System.out.print("write a number in serie (1...10): ");
	Scanner input = new Scanner(System.in);
	
	int intUserInput = input.nextInt();
	
	Function sendInput = new Function();
	sendInput.setInput(intUserInput);
	sendInput.getInput();
	}
}
