/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week6.airline;
/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Plane extends Vehicle implements Flyable {
    
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;

    public Plane() {
        this(0.0, "", "");
    }
    
    public Plane(double fuel, String airline, String boeing) {
        setFuel(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public String getAirline() {
        return airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }

    @Override
    public void startEngine() {
        if (fuel < 20) {
            System.out.println("Fuel is not enough.");
            return;
        }
        System.out.println("Plane’s Engine starts");
        fuel -= 20;
    }

    @Override
    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }

    @Override
    public void honk() {
        System.out.println("Weeeeeee");
    }

    @Override
    public void fly() {
        if (fuel < 20) {
            System.out.println("Fuel is nearly empty.");
            return;
        } 
        System.out.println("Plane Fly");
        fuel -= 20;
    }

    @Override
    public void takeOff() {
        if (fuel < 10) {
            System.out.println("Fuel is nearly empty.");
            return;
        } 
        System.out.println("Plane Already to Take Off");
        fuel -= 10;
    }

    @Override
    public void landing() {
        if (fuel < 10) {
            System.out.println("Fuel is nearly empty.");
            return;
        } 
        System.out.println("Plane Already to Landing");
        fuel -= 10;
    }
    
}

    
    