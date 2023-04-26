package week51;


/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Seller extends Employee {
    
    public Food sell(Employee e) {
        Food food = new Food();
        double price = Food.getPrice();
        if (e.getWallet().getBalance() >= Food.getPrice()) {
            getWallet().setBalance(getWallet().getBalance() + price);
            e.getWallet().setBalance(e.getWallet().getBalance() - price);
            return food;
        } else {
            System.out.println("Your money is not enough.");
        }
        return null;
    }
    
}
