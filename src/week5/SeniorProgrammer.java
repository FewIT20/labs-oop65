/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class SeniorProgrammer extends Programmer {

    @Override //Override replace method
    public void coding(String str) {
        if (getEnergy() >= 10) {
            System.out.println("I'm coding about " + str);
        } else {
            System.out.println("ZzZzZz");
        }
        //Decrement of energy and happiness with 5 point
        setEnergy(getEnergy() - 5);
        setHappiness(getHappiness() - 5);
    }
    
    public void coding(String str, int num) {
        for (int i = 0; i < num; i++) {
            //Call at method coding(String str) in SeniorProgrammer.
            this.coding(str);
        }
    }
    
    public void compliment(Programmer p) {
        //Increment a happiness 5 point of attribute Programmer class. 
        System.out.println(p.getName() + " in a good mood");
        p.setHappiness(p.getHappiness() + 20);
    }
    
    public void blame(Programmer p) {
        //Decrement a happiness 5 point of attribute Programmer class. 
        System.out.println(p.getName() + " in a bad mood");
        p.setHappiness(p.getHappiness() - 20);
    }
}
