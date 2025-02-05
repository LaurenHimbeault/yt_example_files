public class ScopeAndConstants {

	static final int LEGAL_DRINKING_AGE = 18; // constant element
	static int variable = 11;

	public static void main(String[] args) {
		int variable = 10; // variable element
		System.out.println(variable);
		variable = 20;
		System.out.println(variable);
		System.out.println(ScopeAndConstants.variable);
		ScopeAndConstants.variable = 22;
		System.out.println(ScopeAndConstants.variable);
		printMessage();
	}

	public static void printMessage() {
		System.out.println(variable);
	}
}