/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Plane extends Vechicle {
    
    public void setPlaneInfo(int s, String t) {
        setFuel(s);
        setTopSpeed(t);
    }
    
    public void fly() {
        int fuel = getFuel();
        if (fuel > 200) {
            System.out.println("Fly.");
        } else{
            System.out.println("Please add fuel.");
        }
    }
    
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is " + getFuel() + " litre and Top speed is " + getTopSpeed() + " m/s.");
    }
    
}
