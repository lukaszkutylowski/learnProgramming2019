/*
Wprowadź z klawiatury wartość liczbową i zainicjuj nią zmienną typu byte o nazwie wrt.
Następnie utwórz program, który wypisze na ekran wartości potęg dwójki lub wartości 0, dla wszystkich bitów z których składa się ta liczba.
Przykładowo dla liczby 5 oczekiwany jest ciąg wynikowy: 0 4 0 1
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        byte wrt = keyScan.nextByte();

        byte[] output = ByteProcessor.getBits(wrt);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
