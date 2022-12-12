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
public class OddAdEvenNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            if ((value % 2) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd number = " + odd + " Even number = " + even);
    }
    
}
