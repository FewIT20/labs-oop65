
/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Pigeous extends Bird{

    public Pigeous() {
        this("", 0);
    }
    
    public Pigeous(String name, int age) {
        super(name, age);
    }
    
    public void eat(Food f) {
        setPower(getPower() + (f.getPower()) * 2);
    }
    
    public void fly() {
        System.out.println(getName() + " fly fly ....");
    }
    
    public void wingAttack(Animal a) {
        wingAttack(a, 1);
    }
    
    public void wingAttack(Animal a, int times) {
        for (int i = 0; i < times; i++ ) {
            a.setPower((a.getPower() - 5));   
        }
    }
}
