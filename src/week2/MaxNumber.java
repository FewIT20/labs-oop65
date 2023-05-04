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
public class MaxNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0; 
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            max = Math.max(max, value);
        }
        sc.close();
        System.out.println(max + " is maximum number");
    }
}
