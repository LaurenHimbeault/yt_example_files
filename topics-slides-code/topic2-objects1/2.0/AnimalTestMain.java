public class AnimalTestMain {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal("Dog", 4);

        // Print the Animal object using the toString method
        System.out.println(myAnimal);

        // Call the sit method
        myAnimal.sit();
    }
}