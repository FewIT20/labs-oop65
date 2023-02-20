

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Programmer extends Employee {
    
    private int happiness;
    
    public void coding(String str) {
        if (getEnergy() < 30) {
            System.out.println("Error Error Error");
        } else {     
            System.out.println("Your code is " + str);
        }
        setEnergy(getEnergy() - 30);
        this.happiness -= 30;
    }
    
    public void coding(char str) {
        this.coding(String.valueOf(str));
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
        
    
}
