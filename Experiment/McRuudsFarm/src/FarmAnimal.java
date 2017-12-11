/**
 * Created by Rogier.
 */
public class FarmAnimal {

    protected String name;
    protected int chipNumber;

    public FarmAnimal(String name, int chipNumber) {
        this.name = name;
        this.chipNumber = chipNumber;
    }

    public void makeSound() {
        System.out.println(name + " says ...");
    }

    public String getName() {
        return name;
    }

    public int getChipNumber() {
        return chipNumber;
    }
}
