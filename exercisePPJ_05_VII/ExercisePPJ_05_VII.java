/*
Dana jest zmienna typu boolean czyPada zainicjowana wartością true, oraz zmienna typu boolean czySwieciSlonce zainicjowaną dowolną wartością.
Napisz program wykorzystujący instrukcję warunkową if i wyświetlający stany pogody jako:
• plucha – gdy pada i nie świeci słońce,
• tęcza – gdy pada i świeci słońce
• słonecznie - gdy świeci słońce i nie pada,
• pochmurno - gdy nie świeci słońce i nie pada.
*/

import java.util.Scanner;

public class ExercisePPJ_05_VII {
	
	public static void main(String[] args) {
	
	boolean czyPada = true;
	boolean czySwieciSlonce = true;
	
	System.out.println("Weather");
	System.out.println("Please enter one from dwo numbers: (1) pada / (2) nie pada");
	
	Scanner input1 = new Scanner(System.in);
	int a = input1.nextInt();

	System.out.println("Please enter one form dwo numbers: (3) swieci / (4) nie swieci");

	Scanner input2 = new Scanner(System.in);
	int b = input2.nextInt();
	
	if(a == 1) {
		czyPada = true;
	}
	else {
		czyPada = false;
	}
	
	if(b == 3) {
		czySwieciSlonce = true;
	}
	else {
		czySwieciSlonce = false;
	}
	
	if((czyPada == true) && (czySwieciSlonce == false)) {
		System.out.println("Weather is: Plucha");
	}
	
	if((czyPada == true) && (czySwieciSlonce == true)) {
		System.out.println("Weather is: Tecza");
	}
	
	if((czyPada == false) && (czySwieciSlonce == false)) {
		System.out.println("Weather is: Pochmurno");
	}
	
	if((czyPada == false) && (czySwieciSlonce == true)) {
		System.out.println("Weather is: Slonecznie");
	}
	
	}
}
