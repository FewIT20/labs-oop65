package week5;



/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Employee {
    
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public static String getNationality() {
        return nationality;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    
    public boolean equals(Employee e) {
        return this.name == e.getName(); 
    }
    
    public void eat(Food f) {
        this.energy += Food.getEnergy();
    }
    
    public boolean buyFood(Seller s) {
        Food food  = s.sell(this);
        if (food != null) {
            this.eat(food);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String builder = "";
        builder += "My name is " + this.name + ".\n";
        builder += "I have " + this.energy + " energy left.\n";
        builder += "I have a balance of " + wallet.getBalance() + " baht.";
        return builder;
    }
    
}
