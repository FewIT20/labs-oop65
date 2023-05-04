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
public class Sample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(number);
        for (int sign = 1; sign <= number; sign++) {
            System.out.print(sign);
        }
        sc.close();
        System.out.print("+");
    }
    
}
