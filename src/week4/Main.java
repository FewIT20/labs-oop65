/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Main {
    
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setPlaneInfo(500, "High");
        plane.showPlaneInfo();
        
        Car car = new Car();
        car.setCarInfo(500, "High", "Diesel");
        car.showCarInfo();
    }
    
}
