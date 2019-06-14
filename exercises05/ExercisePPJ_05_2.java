/*
Dane są następujące zbiory:
• A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
• B = (−∞, −13] ∪ (−8, −3]
• C = [−4, ∞)
Napisz program weryfikujący, czy zmienna int wrt należy do części wspólnej tych zbiorów.
*/

import java.util.Scanner;

public class ExercisePPJ_05_2 {
	public static void main(String[] args) {
		System.out.println("• A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)");
		System.out.println("• B = (−∞, −13] ∪ (−8, −3]");
		System.out.println("• C = [−4, ∞)");
		System.out.println("");
		System.out.print("input value of variable 'wrt': ");
		
		Scanner input = new Scanner(System.in);
		int wrt = input.nextInt();
		
		if(wrt >= -4) {
			if((wrt > -5) && (wrt < 0)) {
				if((wrt > -8) && (wrt <= -3)) {
					System.out.println("input number it is contained in intervals A, B and C");
				} else {
					System.out.println("input number it is NOT contained in intervals A, B and C");
				  }
			} else {
				System.out.println("input number it is NOT contained in intervals A, B and C");
			  }
		} else {
			System.out.println("input number it is NOT contained in intervals A, B and C");
		  }
	}
}
