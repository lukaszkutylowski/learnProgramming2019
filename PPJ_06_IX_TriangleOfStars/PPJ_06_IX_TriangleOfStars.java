/*
Napisz program, który wykorzystując pętle utworzy trójkąt składający się z literału *
:
*
**
***
****
*****
*/

public class PPJ_06_IX_TriangleOfStars {
	
	public static void main(String[] args) {
		char a = 42;
		
		for(int i = 1; i <= 5; i++) {
			switch (i) {
			case 1: System.out.println(a); break;
			case 2: System.out.println(a+""+a); break;
			case 3: System.out.println(a+""+a+""+a); break;
			case 4: System.out.println(a+""+a+""+a+""+a); break;
			case 5: System.out.println(a+""+a+""+a+""+a+""+a); break;
			}
		}
	}
}
