/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week6.airline;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Pigeon extends Bird {
    
    private static  int numberOfPigeon;

    public Pigeon() {
        this(0.0, 0.0, 0.0);
    }
    
    public Pigeon(double wingSize, double weight, double height) {
        super(wingSize, weight, height);
        this.numberOfPigeon += 1;
    }
    
    public void eat(String food) {
        if (food.equals("worm")) {
            super.eat(0.5);
        } else if (food.equals("seed")) {
            super.eat(0.2);
        } else {
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }

    @Override
    public void fly() {
        if (getWeight() < 5) {
            System.out.println("I’m hungry.");
            return;
        }
        setWeight(getWeight() - 0.25);
        System.out.println("Fly Fly");
    }

    @Override
    public void takeOff() {
        if (getWeight() < 5) {
            System.out.println("I’m hungry.");
            return;
        }
        setWeight(getWeight() - 0.5);
        System.out.println("Take Off");
    }

    @Override
    public void landing() {
        if (getWeight() < 5) {
            System.out.println("I’m hungry.");
            return;
        }
        setWeight(getWeight() - 0.5);
        System.out.println("Landing");
    }

    @Override
    public String toString() {
        return "Pigeon " + getWeight() + " kg and " + getHeight() + " cm. There are " + numberOfPigeon + " pigeons.";
    }
    
    
}
