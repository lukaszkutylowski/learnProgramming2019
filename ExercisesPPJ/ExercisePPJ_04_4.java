/*
Wykorzystaj kod z zadania V drugich ćwiczeń aby wprowadzić z klawiatury wartość, która zostanie przypisana do zmiennej x. Wypisz na konsoli czy wprowadzona wartość jest mniejsza niż 10, 100, 1000.
*/

import java.util.Scanner;

public class ExercisePPJ_04_4 {
	
	public static void main(String[] args) {
	
	System.out.print("input value form keyboard: ");
	
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	
	System.out.println("number is: "+x);
	
	int i = 0;
	if(x < 10) {
		
		System.out.println("input number is less than 10");
	}
	else if((x < 100) && (x >= 10)) {
		System.out.println("imput number is less than 100");
	}
	else if((x < 1000) && (x >= 100)) {
		System.out.println("imput number is less than 1000");
	}
	else {
		System.out.println("imput number is highest than 1000");
	}
}
}
