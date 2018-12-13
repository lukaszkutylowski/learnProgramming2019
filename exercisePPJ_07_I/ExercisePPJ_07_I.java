/*
Dana jest zmienna int wrt zainicjowana dowolną wartością liczbową z przedziału 0 do 10.
Utwórz program wypisujący na ekranie "int z przedziału <6, 10>" gdy zmienna wrt jest większa od 5,
oraz "int z przedziału <0, 5>"w przeciwnym przypadku.
*/

import java.util.Scanner;

public class ExercisePPJ_07_I {
	public static void main(String[] args) {
		int wrt = Integer.parseInt(args[0]);
		String rangeA = "int z przedziału <6, 10>";
		String rangeB = "int z przedziału <0, 5>";
		String showRange = rangeB;
		if(wrt > 5) {
			showRange = rangeA;
		}
		System.out.println(showRange);
	}
}
