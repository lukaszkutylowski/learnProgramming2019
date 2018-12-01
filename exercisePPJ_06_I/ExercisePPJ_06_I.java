/*
Wprowadź z klawiatury wartość liczbową i zainicjuj nią zmienną typu byte o nazwie wrt.
Następnie utwórz program, który wypisze na ekran wartości potęg dwójki lub wartości 0, dla wszystkich bitów z których składa się ta liczba.
Przykładowo dla liczby 5 oczekiwany jest ciąg wynikowy: 0 4 0 1
*/

import java.util.Scanner;

public class ExercisePPJ_06_I {
	
	public static void main(String[] args) {
	
	double binaryWrt[] = {0,0,0,0,0,0,0,0};
	
	System.out.print("Input of number: ");
	Scanner input = new Scanner(System.in);
	byte wrt = input.nextByte();
	
	double wrtDouble = (double) wrt;

	for(int counter = 3; counter >= 0; counter--) {
		
		int exponent = 0;
		
		while(wrtDouble > Math.pow(2,exponent)) {
			exponent++;
		}
		
		if(wrtDouble == Math.pow(2,exponent)) {
			binaryWrt[exponent] = Math.pow(2,exponent);
		}
		else {
			binaryWrt[exponent-1] = Math.pow(2,(exponent-1));
			
			int highestExponent = exponent-1;
			double rest = wrtDouble - Math.pow(2,highestExponent);
			
			wrtDouble = rest;
			exponent=0;
		}
	}
	
	for(int exponent = 0; exponent <= 7; exponent++) {
		System.out.println("2^"+exponent+": "+binaryWrt[exponent]);
	}
	
	System.out.print("Binary: 0b");
	for(int exponent = 7; exponent >= 0; exponent--) {
		if(binaryWrt[exponent] != 0.0) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
	}
	System.out.println("");
	}
}
