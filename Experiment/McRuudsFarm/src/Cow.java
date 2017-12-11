/**
 * Class represents a farm cow.
 */
public class Cow extends FarmAnimal {

    private int litersMilkPerDay;

    public Cow(String name, int chipNumber, int litersMilkPerDay) {
        super(name, chipNumber);
        this.litersMilkPerDay = litersMilkPerDay;
    }

    public void makeSound() {
        System.out.println(name + " says MMHHOOOEEEEWWW");
    }

    @Override
    public String toString() {
        return "Cow " + name + " delivers " + litersMilkPerDay + " liters of milk a day";
    }
}
