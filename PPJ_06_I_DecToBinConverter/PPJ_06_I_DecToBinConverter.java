/*
Wprowadź z klawiatury wartość liczbową i zainicjuj nią zmienną typu byte o nazwie wrt.
Następnie utwórz program, który wypisze na ekran wartości potęg dwójki lub wartości 0, dla wszystkich bitów z których składa się ta liczba.
Przykładowo dla liczby 5 oczekiwany jest ciąg wynikowy: 0 4 0 1
*/

import java.util.Scanner;

public class PPJ_06_I_DecToBinConverter {
	
	public static void main(String[] args) {
	
	System.out.print("Input of number: ");
	Scanner input = new Scanner(System.in);
	byte wrt = input.nextByte();
	
	double wrtDouble = (double) wrt;
	
	FunctionPPJ_06_I sendParam = new FunctionPPJ_06_I();
	sendParam.setClassVariable(wrtDouble);
	sendParam.decimalToBinaryConverter();
	sendParam.showFunction();
	sendParam.binaryFunction();
	
	System.out.println("");
	}
}
