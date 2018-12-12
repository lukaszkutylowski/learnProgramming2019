/*
Jaki będzie rezultat poniższego programu:
*/

public class ExercisePPJ_06_III {
	
	public static void main(String[] args) {
	
	boolean x, z = true;
	int y = 20;
	x = (y != 10) ^ (z = false) ;
	
	FunctionPPJ_06_III sendParam = new FunctionPPJ_06_III();
	sendParam.setFunction(x,y,z);
	sendParam.getFunction();
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

