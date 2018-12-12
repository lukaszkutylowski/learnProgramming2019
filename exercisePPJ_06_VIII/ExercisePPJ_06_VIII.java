/*
Utwórz program wyświetlający na ekran pierwsze 10 elementów szeregu geometrycznego
*/

public class ExercisePPJ_06_VIII {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++) {
			double x = 1 / (Math.pow(2,i));
			System.out.println(x);
		}
	}
}
