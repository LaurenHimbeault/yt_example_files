public class Methods {
	public static void main(String[] args) { // main method
		String hat = "hat";
		printMessage(hat);
		double addedTogether = addNumbs(5, 10);
		System.out.println(addedTogether);
		System.out.println("Hello, World!");
	}

	public static void printMessage(String chapeau) {
		System.out.println("Sacre Bleu! That's a nice " + chapeau);

	}

	public static double addNumbs(double num1, double num2) {
		double added = num1 + num2;
		return added;
	}


}