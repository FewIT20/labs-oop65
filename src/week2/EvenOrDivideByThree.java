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
public class EvenOrDivideByThree {
    
    public static void main(String[] args) {
        String firsted = null;
        
        while (true) {
            try (Scanner sc = new Scanner(System.in)) {
				int value = sc.nextInt();
				if (firsted == null) {
				    firsted = ""+value;
				}
				if (((value % 2) == 0) || (value % 3) == 0) {
				    break;
				}
			}
        }
        System.out.println(firsted);
    }
    
}
