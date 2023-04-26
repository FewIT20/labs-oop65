package week61;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

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

    public void setCredit(double credit) {
        if (credit < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) {
        if (a < 0) {
            super.withdraw(a);
            return;
        }
        if (balance - a >= 0) {
            balance = balance - a;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else if ((balance - a) < 0 && credit > 0) {
            this.balance = 0;
            this.credit = credit - a;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else {
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
    
}
