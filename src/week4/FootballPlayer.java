package week4;



/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class FootballPlayer extends Player {
    
    private int playerNumber;
    private String position;

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
        return p.getPosition().equals(this.position) && p.getTeam().equals(super.getTeam());
    }
    
}
