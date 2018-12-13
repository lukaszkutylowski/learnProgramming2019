public class PlusPlus {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		int c = 20;
		int d = 30;
		int e = 40;
		
		System.out.println(a);
		b = a++;
		System.out.println(a);
		c = ++a;
		System.out.println(a);
		d = a++ + ++a;
		System.out.println(a);
		e = a + 1;
		System.out.println(a);
	}
}
