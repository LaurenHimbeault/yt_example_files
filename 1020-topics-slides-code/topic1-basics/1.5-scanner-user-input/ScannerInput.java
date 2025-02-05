import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.printf("Hello, %s. You told me that you are %d years old%n", name, age);
	}
}