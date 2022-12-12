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
public class MySwitch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        switch (x) {
            case 1: case 2:
                System.out.println("Green");
                break;
            case 3: case 4: case 5:
                System.out.println("Blue");
                break;
            default:
                System.out.println("numbers 1-5 only");
        }
        System.out.println("Red");
    }
    
}
