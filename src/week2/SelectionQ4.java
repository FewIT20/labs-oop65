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
public class SelectionQ4 {
 
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        if ( x > 10 ) {
            System.out.println("Green");
            System.out.println("Blue");
        }
        sc.close();
        System.out.println("Red");
    }
}
