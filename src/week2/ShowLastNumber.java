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
public class ShowLastNumber {
    
    public static void main(String[] args) {
        int last_number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            last_number = value;
        }
        System.out.println(last_number);
    }
    
}
