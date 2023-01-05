/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Novice extends Player {

    public Novice() {
        setHP(10);
        setMP(10);
        setATK(5);
    }
    
    public void addEquipment(Item i) {
        i.use(this);
    }

    @Override
    public void attack(Player p) {
        p.attacked(getATK());
    }

    @Override
    public void attacked(double n) {
        setHP(getHP() - n);
    }
    
}
