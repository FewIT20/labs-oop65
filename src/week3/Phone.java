package week3;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Phone {
    
    private String brandName;
    private boolean hasFM;
    private boolean hasCamera;
    private double price;
    private int space;
    
    public void call(String n) {
        System.out.println("Calling to " + n);
    }
    
    public void turnOn() {
        System.out.println("On");
    }
    
    public void turnOff() {
        System.out.println("Off");
    }
    
    public void showBrand() {
        System.out.println("Brand > " + this.brandName);
    }
    
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.turnOn();
        p1.call("Peter");
        p1.showBrand();
        p1.turnOff();
    }
    
}
