public class PlusPlus {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 1, d = 1, e = 1;
		
		System.out.println("start value of a = " + a);
		b = b + a++;
		System.out.println("start value of b = 1 and after' b = b + a++': " + b);
		c = c + ++a;
		System.out.println("start value of c = 1 and after' c = c + ++a': " + c);
		d = d + a++ + ++a;
		System.out.println("start value of d = 1 and after' d = d + a++ + ++a': " + d);
		e = e + a + 1;
		System.out.println("start value of e = 1 and after' e = e + a + 1': " + e);
		
		a = 1;
		System.out.println("a++ :" + a++);
		a = 1;
		System.out.println("++a :" + ++a);
		a = 1;
		System.out.println("a++ + ++a :" + (a++ + ++a));
	}
}
