/* Napisz program wyświetlający wartości od 1 do 10. Wykorzystaj w tym celu pętle ana jest zmienna int wrt .
Zmodyfikuj poprzedni program, tak aby wyświetlał wartości będące wynikiem mnożenia kolejnej wartości zmiennej pętli i zmiennej wrt.
*/

import java.util.Scanner;

public class ExercisePPJ_06_VI {
	
	public static void main(String[] args) {
		
		System.out.println("input a number: ");
		Scanner input = new Scanner(System.in);
		int wrt = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i*wrt);
		}
	}
}
