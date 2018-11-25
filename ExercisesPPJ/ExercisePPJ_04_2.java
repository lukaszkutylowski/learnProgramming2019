/* zadeklaruj i zainicjuj zmienne poniższych typów, następnie sprawdz jaki będzie rezultat dodania...  */

public class ExercisePPJ_04_2 {
	
	public static void main(String[] args) {
	
	char aChar = 68;
	int bInt = 10;
	float cFloat = 15;
	double dDouble = 20;
	byte eByte = 1;
	
//	char varChar = aChar + bInt; // nie kompiluje się - nie można dodać
	int varInt = bInt + aChar; // kompiluje się - można dodać int + char
//	float varFloat = cFloat + dDouble; // nie kompiluje się - nie można dodać
//	byte varByte = eByte + bInt; // nie kompiluje się - nie można dodać
	
	System.out.println("char aChar = 68;");
	System.out.println("int bInt = 10;");
	System.out.println("float cFloat = 15;");
	System.out.println("double dDouble = 20;");
	System.out.println("byte eByte = 1;");
	
	System.out.println("wynik operacji 'int varInt = bInt + aChar' to "+varInt);
	
	System.out.print("wynik operacji 'System.out.println(aChar + bInt);' to ");
	System.out.println(aChar + bInt);
	System.out.print("wynik operacji 'System.out.println(bInt + aChar);' to ");
	System.out.println(bInt + aChar);
	System.out.print("wynik operacji 'System.out.println(cFloat + dDouble);' to ");
	System.out.println(cFloat + dDouble);
	System.out.print("wynik operacji 'System.out.println(eByte + bInt);' to ");
	System.out.println(eByte + bInt);
}
}
