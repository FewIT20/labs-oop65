package week4;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Plane extends Vehicle {
    
    public void setPlaneInfo(int s, String t) {
        setFuel(s);
        setTopSpeed(t);
    }
    
    public void fly() {
        int fuel = getFuel();
        if (fuel > 200) {
            System.out.println("Fly.");
            setFuel(getFuel() - 200);
        } else{
            System.out.println("Please add fuel.");
        }
    }
    
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is "+getFuel()+" litre and Top Speed is High m/s.");
    }
    
}
