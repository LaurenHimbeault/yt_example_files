public class FormattingOutput {
	public static void main(String[] args) {
		int x = 4;
		int y = 12;
		int z = 456;
		System.out.println(x + "\t" + y + "\t" + z);
		System.out.println(z + "\t" + x + "\t" + y);
		System.out.println(y + "\t" + z + "\t" + x);

		System.out.printf("The value of x is%n%5d%5d%5d%n", x, y, z);
		System.out.printf("%5d%5d%5d%n", z, x, y);
		System.out.printf("%5d%5d%5d%n", y, z, x);

	}
	
}