import java.util.ArrayList;

public class AnimalInterfaceMain {
    public static void main(String[] args) {
        ArrayList<IMakesSound> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Mouse());

        for (IMakesSound animal : animals) {
            animal.makeSound();
        }
    }
}
