import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

/**
 *
 */
public class App {

    public void run() {

        Cow cow1 = new Cow("Bertha1989", 101, 31);
        Horse horse1 = new Horse("MrEd", 200, false);
        Sheep sheep1 = new Sheep("Shaun", 301, 150.50, "White");

        ArrayList<FarmAnimal> animals = new ArrayList<>();
        animals.add(cow1);
        animals.add(horse1);
        animals.add(sheep1);

        for (FarmAnimal animal: animals) {
           animal.makeSound();
        }
    }

    public static void main(String[] args) {
        new App().run();
    }
}
