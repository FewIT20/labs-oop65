/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class MyCall {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = reader.nextDouble();
        if (salary > 50000) {
            System.out.println(salary * 0.1);
        } else {
            System.out.println(salary * 0.05);
        }
    }
    
}
