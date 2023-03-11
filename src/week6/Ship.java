package week6;


/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Ship extends Vehicle implements Floatable {

    public Ship() {
        this(0.0);
    }
    
    public Ship(double fuel) {
        super(fuel);
    }

    @Override
    public void fl0at() {
        if (getFuel() >= 50) {
            setFuel(getFuel() - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void startEngine() {
        if (getFuel() >= 10) {
            setFuel(getFuel() - 10);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }

    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    
    public void move() {
        this.move(1);
    }
    
    public void move(int distance) {
        for (int i = 1; i <= distance ; i++) {
            if (getFuel() < 50) {
                System.out.println("Fuel is not enough.");
                break;
            }
            this.fl0at();
        }
    }
    
}
