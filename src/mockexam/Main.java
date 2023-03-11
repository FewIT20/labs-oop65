package mockexam;



/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Main {
    
    public static void main(String[] args) {
        Player p1 = new Player("FewPz");
        Player p2 = new Player("Few789");
        
        p1.setHouses(new Gryffindor());
        p2.setHouses(new Hufflepuff());
        
        System.out.println(p1);
        System.out.println(p2);
        
        p1.attack(p2, new Incendio());
        p2.attack(p1, new Expelliarmus());
        p2.attack(p1, new Incendio());
        p1.attack(p2, new Incendio());
        
        System.out.println(p1);
        System.out.println(p2);
        
        p2.protectFromPlayer(p1);
        p2.protectFromPlayer(p1);
        p2.protectFromPlayer(p1);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
