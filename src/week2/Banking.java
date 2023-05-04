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
public class Banking {
    
    public static void main(String[] args) {
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char bank = sc.next().charAt(0);
        switch (bank) {
            case 'A': total = money * 1.015;
                    break;
            case 'B': total = money * 1.02;
                    break;
            case 'C': total = money * 1.015;
                    break;
            default: total = money * 1.05;
                    break;
        }
        sc.close();
        System.out.println(total);
    }
    
}
