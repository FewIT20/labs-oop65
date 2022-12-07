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
public class CircleArea {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
    
}
