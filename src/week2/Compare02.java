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
public class Compare02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n1 = sc.next().charAt(0);
		if (n1 == 'A') {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		sc.close();
	}
}
