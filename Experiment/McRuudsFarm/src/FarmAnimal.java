/**
 * Created by Rogier.
 */
public abstract class FarmAnimal {

    protected String name;
    protected int chipNumber;

    public FarmAnimal(String name, int chipNumber) {
        this.name = name;
        this.chipNumber = chipNumber;
    }

    abstract public void makeSound() ;

    public String getName() {
        return name;
    }

    public int getChipNumber() {
        return chipNumber;
    }
}
