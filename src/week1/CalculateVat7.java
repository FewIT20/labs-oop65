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
public class CalculateVat7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int price_with_vat = price + (price * 7) / 100;
        System.out.println(price_with_vat);
        sc.close();
    }
    
}
