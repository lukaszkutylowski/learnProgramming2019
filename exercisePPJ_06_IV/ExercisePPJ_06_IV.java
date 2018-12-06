/*
Dane są zmienne int dzien i int miesiac, które należy zainicjować bieżącą datą.
Napisz program liczący ile dni upłynęło od rozpoczęcia roku do tej daty.
*/

import java.util.Scanner;

public class ExercisePPJ_06_IV {
	
	public static void main(String[] args) {
	
	System.out.print("input a number of month: ");
	Scanner input1 = new Scanner(System.in);
	int month = input1.nextInt();
	
	System.out.print("input a number of day: ");
	Scanner input2 = new Scanner(System.in);
	int day = input2.nextInt();
	
	FunctionPPJ_06_IV sendDate = new FunctionPPJ_06_IV();
	sendDate.setFunction(month, day);
	sendDate.calculateDays();
	}
}
