/*
Sprawdz jaki będzie rezultat poniższego programu: 
int x = 4 ;
long y = x ∗ 4 − x++;
if ( y<12) System . out . println ( "za malo " ) ; 
else System . out . println ( "w sam raz" ) ;
Odpowiedź uzasadnij.
*/

public class ExercisePPJ_05_VI {
	
	public static void main(String[] args) {
	
	int x = 4 ;
	long y1 = x1 * 4 - x++;
	long y2 = x2 * 4 - ++x;
	System.out.println("y = x * 4 - x++ ="+y1);
	System.out.println("y = x * 4 - ++x ="+y2);
	System.out.println("Operator x++ first realized math operations next add 1 to x.");
	System.out.println("Operator ++x first realized add 1 to x next math operations.");
	
	if ( y2<12) System . out . println ( "za malo " ) ; 
	else System . out . println ( "w sam raz" ) ;
	
	/*
	Effect of program working is print communicate: 'w sam raz'.
	Result of equal 'y = x * 4 - x++' and equal 'y = x * 4 = x' is the same, because x++ operator is not functioning
	in the same way that ++x.
	Operator x++ first realized math operations next add 1 to x.
	Operator ++x first realized add 1 to x next math operations.
	*/
	}
}
