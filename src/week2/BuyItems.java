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
public class BuyItems {
    
    public static void main(String[] args) {
        double total_balance = 375.99;
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert your monitor size 38 or 43 only");
        int size_display = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int toggle_dvd = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int toggle_printer = sc.nextInt();
        System.out.println("====== Your order ======");
        System.out.println("* computer >>> 375.99$");
        if (size_display == 38) {
            total_balance += 75.99;
        } else {
            total_balance += 99.99;
        }
        System.out.println("* " + size_display + "'Monitor >>> 99.99$");
        if (toggle_dvd == 1) {
            total_balance += 65.99;
            System.out.println("* DVD-Rom >>> 65.99$");
        } 
        if (toggle_printer == 1) {
            total_balance += 125.00;
            System.out.println("* DVD-Rom >>> 125.00$");
        } 
        System.out.println("====== Total price >>> " + total_balance + " ======");
    }
    
}
