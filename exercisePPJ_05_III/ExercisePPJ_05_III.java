/*
Jaki będzie wynik operacji matematycznej (pierwiastek 2 stopnia z 2)^2 − 2?
*/

import static java.lang.Math.*;

public class ExercisePPJ_05_III {
	
	public static void main(String[] args) {
	
	double xSqrt = sqrt(2);
	double xPow = pow(xSqrt,2);
	double xEqual = xPow - 2;
	double Equal = pow(sqrt(2),2) - 2;
	
	System.out.println("result of math equation '(second degree element of 2)^2 − 2 with 3' variables is : "+xEqual);
	System.out.println("result of math equation '(second degree element of 2)^2 − 2 with 1' variables is : "+Equal);
	
	//Test
	if(xEqual == Equal) {
		System.out.println("TEST: program working well");
	}
	else {
		System.out.println("TEST: program working bad");
	}
	}
}
