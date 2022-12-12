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
public class Sequence03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for (int i = 1; i <= value; i++) {
            if ((i % 5) == 0) {
                System.out.print("\n");
            } else {
                System.out.print("|");
            }
        }
    }
    
}
