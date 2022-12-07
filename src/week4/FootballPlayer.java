/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week4;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class FootballPlayer {
    
    private int playerNumber;
    private String position;
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

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }

    public void setPosition(String p) {
        this.position = p;
    }
    
    public boolean isSamePosition(FootballPlayer p) {
        return p.getPosition().equals(this.position) && p.getTeam().equals(this.team);
    }
    
    public boolean isSameTeam(FootballPlayer p) {
        return this.team.equals(p.getTeam());
    }
    
    public static void main(String[] args) {
        FootballPlayer p1 = new FootballPlayer();
        FootballPlayer p2 = new FootballPlayer();
        p1.setName("Harry");
        p1.setTeam("Gryffindor");
        p1.setPlayerNumber(1);
        p1.setPosition("keeper");
        p2.setName("Jame");
        p2.setTeam("Gryffindor");
        p2.setPlayerNumber(1);
        p2.setPosition("keeper");
        
        System.out.println("We are same position : " + p1.isSamePosition(p2));
        System.out.println("We are same team : " + p1.isSameTeam(p2));
    }
    
}
