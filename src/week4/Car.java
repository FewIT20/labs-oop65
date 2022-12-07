/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Car extends Vechicle {
    
    private String typeEngine;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String t) {
        this.typeEngine = t;
    }
    
    public void setCarInfo(int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    
    public void move() {
        int fuel = getFuel();
        if (fuel > 50) {
            System.out.println("Move.");
            setFuel(getFuel() - 50);
        } else {
            System.out.println("Please add fuel.");
        }
    }
    
    public void showCarInfo() {
        System.out.println("Car engine is " + this.typeEngine);
        super.showInfo();
    }
}
