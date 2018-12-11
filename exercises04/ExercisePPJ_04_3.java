/*
Dane jest wyrażenie: int x = 2*5 + 3*4 -8; Jaki jest rezultat tychoperacji?
Zmodyfikuj kolejność działań (dodając nawiasy) tak, aby rezultatem była wartość 48.
*/

public class ExercisePPJ_04_3 {
	
	public static void main(String[] args) {
	
	int x1 = 2 * 5 + 3 * 4 - 8;
	
	int x2 = 2 * (((5 + 3) * 4) - 8);
	
	System.out.println("Wartość wyrażenia 'x = 2 * 5 + 3 * 4 - 8' to: "+x1);
	System.out.println("Wartość wyrażenia 'x = 2 * (((5 + 3) * 4) - 8)' to: "+x2);
	}
}
