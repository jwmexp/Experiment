/**
 * Class represents a farm sheep
 */
public class Sheep extends FarmAnimal {

    private double weight;
    private String colorWool;

    public Sheep(String name, int chipNumber, double weight, String colorWool) {
        super(name, chipNumber);
        this.weight = weight;
        this.colorWool = colorWool;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says BBBAAAHHH");
    }

    @Override
    public String toString() {
        return "Sheep " + name + " weights " + weight + " kg and has color " + colorWool;
    }
}
