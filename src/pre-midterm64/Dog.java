
/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, 200, age);
    }
    
    public void eat(Food f) {   
        setPower(getPower() + (f.getPower() * 1));
    }
    
    public void kick(Animal a) {
        a.setPower(a.getPower() - 10);
    }
        
    
}
