/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Cat {
    
    private String name;
    private String color;
    
    public double height;
    public double weight;

    private void setWeight(double w) {
        if (w > 0) {
            this.weight = w;   
        } else {
            System.out.println("Error");
        }
    }

    private void setHeight(double h) {
        if (h > 0) {
            this.height = h;   
        } else {
            System.out.println("Error");
        }
    }

    private void setName(String n) {
        this.name = n;
    }

    private void setColor(String c) {
        this.color = c;
    }
    
    public void defineCat(String n, String c) {
        setName(n);
        setColor(c);
    }
    
    public void upWeight(double w) {
        setWeight(this.weight + w);
    }
    
    public void downWeight(double w) {
        setWeight(this.weight - w);
    }
    
    public void upHeight(double h) {
        setHeight(this.height + h);
    }
    
    public void speak() {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
    }
    
}
