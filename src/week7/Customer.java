package week7;


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
    private Account[] acct;
    private int numOfAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
    }
    
    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        this.numOfAccount++;
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + getNumOfAccount();
    }
    
}
