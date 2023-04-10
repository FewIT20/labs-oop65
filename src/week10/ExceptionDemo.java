/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week10;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double determinant = b * b - 4 * a * c;
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("x1 : " + root1);
            System.out.println("x2 : " + root2);
        } catch (NumberFormatException ex) {
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }

}
