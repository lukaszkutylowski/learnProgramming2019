/*
Dana jest zmienna int wrt zainicjowana dowolną wartością liczbową z przedziału 0 do 10.
Utwórz program wypisujący na ekranie "int z przedziału <6, 10>" gdy zmienna wrt jest większa od 5,
oraz "int z przedziału <0, 5>"w przeciwnym przypadku.
*/

import java.util.Scanner;

public class ExercisePPJ_07_I {
	public static void main(String[] args) { 
		//System.out.print("Input value in range 0...10: ");
		//Scanner input = new Scanner(System.in);
		//int wrt = input.nextInt();
		
		//code change - input from args
		
		String wrtS =  args[0];
		int wrt = Integer.parseInt(wrtS);
		if(wrt > 5) {
			System.out.println("int z przedziału <6, 10>");
		} else {
			System.out.println("int z przedziału <0, 5>");
		}
	}
}
