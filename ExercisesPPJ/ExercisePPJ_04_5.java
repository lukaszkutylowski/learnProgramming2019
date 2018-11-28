/*
Napisz program, który sprawdzi czy wprowadzona wartość w poprzednim zadaniu należy do przedziałów: A, B i C
*/

import java.util.Scanner;

public class ExercisePPJ_04_5 {
	
	public static void main(String[] args) {
	
	System.out.print("input value form keyboard: ");
	
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	
	System.out.println("number is: "+x);
	
	int i = 0;
	if(x >= 0) {
		
		System.out.println("input number it's contained in interval A=[0;inf)");
	}
	
	if(x <= 1) {
		System.out.println("imput number it's contained in interval B=(-inf;1]");
	}
	
	if((x >= 0) && (x <= 1)) {
		System.out.println("imput number it's contained in interval C=[0;1]");
	}
}
}
