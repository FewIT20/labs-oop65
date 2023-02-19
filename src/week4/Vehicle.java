/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Vehicle {
    
    private int fuel;
    private String topSpeed;
    
    protected void setFuel(int i) {
        this.fuel = i;
    }
    
    protected void setTopSpeed(String n)  {
        this.topSpeed = n;
    }

    protected int getFuel() {
        return fuel;
    }

    protected String getTopSpeed() {
        return topSpeed;
    }
    
    public void showInfo() {
        System.out.println("Fuel is " + this.fuel + " litre and Top Speed is " + topSpeed + " m/s.");
    }
    
}
