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
	String weather = "";
	
	System.out.println("Weather");
	System.out.println("Please enter one from two numbers: (1) pada / (2) nie pada");
	
	Scanner input1 = new Scanner(System.in);
	int a = input1.nextInt();

	System.out.println("Please enter one form two numbers: (3) swieci / (4) nie swieci");

	//Scanner input2 = new Scanner(System.in);
	int b = input1.nextInt();
	
	if(a != 1) {
		czyPada = false;
	}
	
	if(b != 3) {
		czySwieciSlonce = false;
	}
	
	if((czyPada == true) && (czySwieciSlonce == false)) {
		weather = "Plucha";
	}
	
	if((czyPada == true) && (czySwieciSlonce == true)) {
		weather = "Tecza";
	}
	
	if((czyPada == false) && (czySwieciSlonce == false)) {
		weather = "Pochmurno";
	}
	
	if((czyPada == false) && (czySwieciSlonce == true)) {
		weather = "Slonecznie";
	}
	System.out.println("Weather is: "+weather);
	}
}
