/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Calculate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 = 6;
        System.out.println("Enter value ");
        num1 = sc.nextInt();
        num1 = num1 + 2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);
        sc.close();
    }
    
}
