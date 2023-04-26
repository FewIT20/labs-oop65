package week61;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Rod extends Item {

    @Override
    public void use(Player P) {
        P.setATK(P.getATK() + 5);
    }
    
}
