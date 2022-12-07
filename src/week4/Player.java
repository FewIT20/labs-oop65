/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Player {
    
    private String name;
    private String team;

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setTeam(String t) {
        this.team = t;
    }
    
    public boolean isSameTeam(Player p) {
        return this.team.equals(p.getTeam());
    }
    
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        
        p2.setName("Khim");
        p2.setTeam("Gate OR");
        
        if (p1.isSameTeam(p2)) {
            System.out.println(p1.getName() + " is a same team with " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is not a same team with " + p2.getName());
        }
    }
    
}
