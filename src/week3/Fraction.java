package week3;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Fraction {
    
    public int topN;
    public int btmN;
    
    public String toFraction() {
        return topN + "/" + btmN;
    }
    
    public String toFloat() {
        return "" + ((double) topN / btmN);
    }
     
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            this.topN = this.topN + f.topN;
        } else {
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
    }
    
    public boolean myEquals(Fraction x) {
        return (this.topN == x.topN) && (this.btmN == x.btmN);
    }
    
    public void LowestTermFrac() {
        int divde = _gcd(this.topN, this.btmN);
        this.topN = this.topN / divde;
        this.btmN = this.btmN / divde;
    }
    
    private int _gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return _gcd(y, x % y);
    }
    
}
