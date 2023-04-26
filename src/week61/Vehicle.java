package week61;




/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public abstract class Vehicle implements Dieselable {
    
    protected double fuel;

    public Vehicle() {
        this(0.0);
    }

    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    
    public void addFuel(double fuel) {
        if (fuel < 0) {
            System.out.println("Fuel is empty.");
            return;
        }
        this.fuel += fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public abstract void honk();
    
}
