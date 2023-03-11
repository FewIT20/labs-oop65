package week7;


/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

import java.util.ArrayList;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class CustomerWithArrayList {
    
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
//    private int numOfAccount;

    public CustomerWithArrayList(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList<>();
    }
    
    public void addAccount(Account acct) {
        this.acct.add(acct);
    }
    
    public Account getAccount(int index) {
        return this.acct.get(index);
    }

    public int getNumOfAccount() {
        return this.acct.size();
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
