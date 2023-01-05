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
        setFuel(fuel);
    }

    @Override
    public void fl0at() {
        if (fuel < 50) {
            System.out.println("Fuel is not enough.");
            return;
        }
        System.out.println("Ship moves");
        fuel -= 50;
    }

    @Override
    public void startEngine() {
        if (fuel < 10) {
            System.out.println("Fuel is not enough.");
            return;
        }
        System.out.println("Engine starts");
        fuel -= 10;
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
        move(1);
    }
    
    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            if (fuel < 50) {
                System.out.println("Fuel is not enough.");
                break;
            }
            fl0at();
        }
    }
    
}
