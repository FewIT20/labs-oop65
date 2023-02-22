
/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public abstract class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, 150, age);
    }
    
    public abstract void wingAttack(Animal a);
    
}
