public class DataTypes {
	public static void main(String[] args) {

		/*
		 * The following lines of code show us
		 * different ways of declaring and
		 * assigning variables of different
		 * data types
		 */
		String fullName; 
		fullName = "Lauren Himbeault"; 
		int age = 30; 
		double salary;
		salary = 10; // 10.0
		System.out.println(fullName + " is " + age + " years old."); // When the .class file is made System.out.println("Lauren Himbeault");
		System.out.println(fullName + " is paid $" + salary);
		salary = 20;
		System.out.println("Now " + fullName + " is paid $" + salary);

	}	
}