public class PrimitiveOperators {
	public static void main(String[] args) {

		System.out.println("Hello"+1); // whole thing into a string
		System.out.println(1.0 + 1); // double
		int x = 1;
		double y = 1.0;
		double z = x + y; 

		int a = 1;
		System.out.println(a);
		a++; // a = a + 1 or a += 1 now a is 2
		System.out.println(a);
		a--; // a = a - 1 or a -= 1
		System.out.println(a);

		double c = 100;
		c /= 2; // c = 50
		c /= 5; // c = c / 5; c = 10
		System.out.println(c);
		System.out.println("Program Ran!");
	}
}