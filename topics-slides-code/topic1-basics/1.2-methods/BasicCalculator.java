public class BasicCalculator {

    // Main method to test the arithmetic operations
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 17;

        // Perform and print addition
        printResult(num1, num2, "+", add(num1, num2));

        // Perform and print subtraction
        printResult(num1, num2, "-", subtract(num1, num2));

        // Perform and print multiplication
        printResult(num1, num2, "*", multiply(num1, num2));

        // Perform and print division
        printResult(num1, num2, "/", divide(num1, num2));
    }
    // Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            return 0.0; // Handle division by zero
        }
        return (double) num1 / num2;
    }

    // Method to print the result
    public static void printResult(int num1, int num2, String operation, double result) {
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

}
