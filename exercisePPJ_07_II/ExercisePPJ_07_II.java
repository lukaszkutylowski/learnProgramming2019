/*
Dana jest zmienna char chr zainicjowana dowolną wartością znakową z przedziału A do Z.
Utwórz program wypisujący na ekranie „znak A - G” gdy zmienna chr jest mniejsza od G, oraz „znak H - Z” w przeciwnym przypadku.
*/

import java.util.Scanner;

public class ExercisePPJ_07_II {
	public static void main(String[] args) {
		System.out.print("Input a big letter from range A...Z: ");
		Scanner input = new Scanner(System.in);
		char chr = input.next().charAt(0);
		
		if(chr <= 71) {
			System.out.println("Znak A - G");
		} else {
			System.out.println("Znak G - Z");
		  }
	}
}
