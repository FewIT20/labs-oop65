package week6;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (acct == null) {
            return firstName + " " + lastName + " doesn’t have account.";
        }
        return "The " + firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit()+ " credits.";
    }

    public boolean equals(Customer c) {
        return c.getFirstName().equals(firstName) && c.getLastName().equals(lastName);
    }
}
