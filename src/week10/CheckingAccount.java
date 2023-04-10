package week10;


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
        this(0, "", 0);
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > 0) {
            if (this.balance - amount >= 0) {
                this.balance = this.balance - amount;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (this.balance - amount < 0 && this.balance - amount + this.credit >= 0) {
                this.credit = this.balance - amount + this.credit;
                this.balance = 0;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (this.balance - amount < 0 && this.balance - amount + this.credit < 0) {
                throw new WithdrawException("Account " + this.name + " has not enough money.");
            }
        } else {
            super.withdraw(amount);
        }
    }

    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Double.parseDouble(a));
    }

    public String toString() {
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }
    
}
