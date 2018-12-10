/*
Napisz program, który wykorzystując pętle utworzy trójkąt składający się z literału *
:
*
**
***
****
*****
*/

public class ExercisePPJ_06_IX {
	
	public static void main(String[] args) {
		char a = 42;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(a);
			}
			System.out.println("");
		}
	}
}
