package week31;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */


import java.util.Scanner;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class ClassMyAdd2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassMyAdd2 cm = new ClassMyAdd2();
        System.out.println("Please insert number1 : ");
        int x = sc.nextInt();
        System.out.println("Please insert number2 : ");
        int num = sc.nextInt();
        
        int result = cm.AddTwo(x);
        System.out.println("The result#1 is " + result);
       
        result = cm.AddNum(x + 5, num);
        System.out.println("The result#2 is " + result);
        
        result = cm.AddTwo(x * 3 + 2);
        System.out.println("The result#3 is " + result);
        sc.close();
    }
    
    public int AddTwo(int a) {
        return AddNum(a, 2);
    }
    
    public int AddNum(int a, int num) {
        return (a + num);
    }
}
