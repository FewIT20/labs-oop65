package week31;

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
    
    public String getBrandName() {
		return brandName;
	}
    
    public double getPrice() {
		return price;
	}
    
    public int getSpace() {
		return space;
	}
    
    public boolean isHasCamera() {
		return hasCamera;
	}
    
    public boolean isHasFM() {
		return hasFM;
	}
}
