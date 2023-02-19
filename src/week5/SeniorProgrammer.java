/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class SeniorProgrammer extends Programmer {

    @Override
    public void coding(String str) {
        if (getEnergy() >= 10) {
            System.out.println("I'm coding about " + str);
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        } else {
            System.out.println("ZzZzZz");
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        }
    }
    
    public void coding(String str, int num) {
        for (int i = 0; i < num; i++) {
            this.coding(str);
        }
    }
    
    public void coding(char str)  {
        System.out.println("I'm coding about " + str);
        setEnergy(getEnergy() - 5);
        setHappiness(getHappiness() - 5);
    }
    
    public void compliment(Programmer p) {
        System.out.println(p.getName() + " in a good mood");
        p.setHappiness(p.getHappiness() + 20);
    }
    
    public void blame(Programmer p) {
        System.out.println(p.getName() + " in a bad mood");
        p.setHappiness(p.getHappiness() - 20);
    }
}
