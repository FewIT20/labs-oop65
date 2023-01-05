/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public abstract class Player {
    
    private double HP;
    private double MP;
    private double Money;
    private double EXP;
    private double ATK;

    public double getATK() {
        return ATK;
    }

    public double getEXP() {
        return EXP;
    }

    public double getHP() {
        return HP;
    }

    public double getMP() {
        return MP;
    }

    public double getMoney() {
        return Money;
    }

    public void setATK(double ATK) {
        if (this.ATK < 0) this.ATK = 0;
        this.ATK = ATK;
    }

    public void setEXP(double EXP) {
        if (this.EXP < 0) this.EXP = 0;
        this.EXP = EXP;
    }

    public void setHP(double HP) {
        if (this.HP < 0) this.HP = 0;
        if (HP < 0) HP = 0;
        this.HP = HP;
    }

    public void setMP(double MP) {
        if (this.MP < 0) this.MP = 0;
        this.MP = MP;
    }

    public void setMoney(double Money) {
        if (this.Money < 0) this.Money = 0;
        this.Money = Money;
    }

    @Override
    public String toString() {
        return "HP : " + HP + " MP: " + MP + " ATK: " + ATK;
    }
    
    public abstract void attack(Player p);
    public abstract void attacked(double n);
    
}
