/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week5;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class CheckingAccount extends Account {

    private double credit;
    
    public CheckingAccount() {
        super(0, "");
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }
        this.credit = credit;
    }
    
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }
    
    public void withdraw(double a) {
        if (a < 0) {
            super.withdraw(a);
            return;
        }
        if (balance - a >= 0) {
            balance = balance - a;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else if (balance - a < 0 && balance - a + credit > 0) {
            credit = balance - a + credit;
            balance = 0;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else if (balance - a < 0 && balance - a + credit < 0) {
            System.out.println("Not enough money!");
        }
    }

    @Override
    public String toString() {
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }
    
}
