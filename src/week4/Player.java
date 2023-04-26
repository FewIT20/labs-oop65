package week4;



/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

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
    
}
