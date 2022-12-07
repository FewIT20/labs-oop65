/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Vechicle {
    
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
        System.out.println("Fuel is " + this.fuel + " litre and Top speed is " + topSpeed + " m/s.");
    }
    
}
