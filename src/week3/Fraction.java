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
            this.btmN = this.btmN;
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
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        f2.topN = 4;
        f2.btmN = 16;
        f3.topN = 5;
        f3.btmN = 15;
        
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        
        System.out.println("f1 is equal is f2 >> " + f1.myEquals(f2));
        System.out.println("f2 is equal is f3 >> " + f2.myEquals(f3));
        
        System.out.println("Befoce : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After: " + f2.toFraction());
    }
    
}
