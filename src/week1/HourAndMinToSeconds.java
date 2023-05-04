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
public class HourAndMinToSeconds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:       Hours : ");
        int hours = sc.nextInt();
        System.out.println("             Mins : ");
        int minutes = sc.nextInt();
        int seconds = (hours * 60 * 60) + (minutes * 60);
        System.out.println("Output: Secs = " + seconds);
        sc.close();
        
    }
    
}
