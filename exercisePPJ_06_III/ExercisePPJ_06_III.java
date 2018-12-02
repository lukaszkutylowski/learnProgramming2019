/*
Jaki będzie rezultat poniższego programu:
*/

public class ExercisePPJ_06_III {
	
	public static void main(String[] args) {
	
	boolean x = true, z = true;
	int y = 20;
	x = (y != 10) ^ (z = false) ;
	System.out.println(x+", "+y+", "+z);
	}
	
	/*
	x = true, z = true, y = 20
	x = (20 != 10) ^ (z = false)
	x = true ^ false
	x = true
	y = 20
	z = false (operator przypisania
	wynik: true, 20, false
	*/
}

