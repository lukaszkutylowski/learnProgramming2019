/*
Dane są następujące zbiory:
• A = (−15, −10)
• B = (−∞, −13)
Napisz program sprawdzający czy zmienna int wrt należy tylko do jednego z tych zbiorów.
*/

import java.util.Scanner;

public class ExercisePPJ_05_3 {
	public static void main(String[] args) {
		System.out.println("• A = (−15, −10)");
		System.out.println("• B = (−∞, −13)");
		System.out.println("");
		System.out.print("input value of varaible 'wrt': ");
		
		Scanner input = new Scanner(System.in);
		int wrt = input.nextInt();
		
		if((wrt <= -15) || ((wrt >= -13) && (wrt <= -10))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
