/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.io.Serializable;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Student implements Serializable {
    
    private String name;
    private int ID;
    private int money;

    public Student() {
        this("",0, 0);
    }

    public Student(String name, int ID, int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }
}
