/**
 * Class represents a farm horse.
 */
public class Horse extends FarmAnimal {

    private boolean canJump;

    public Horse(String name, int chipNumber, boolean canJump) {
        super(name, chipNumber);
        this.canJump = canJump;
    }
    @Override
        public void makeSound() {
        System.out.println(name + " says HIIIIII");
    }

    @Override
    public String toString() {
        if (canJump) {
            return "Horse " + name + " can sure jump";
        }else {
            return "Horse " + name + " can't jump";
        }
    }
}
