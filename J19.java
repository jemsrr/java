import java.util.Scanner;

public class J19 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = num.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = num.nextInt();

        int lcm = (num1 > num2) ? num1 : num2 ;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("lcm of " + num1 + " and " + num2 + " is " + lcm);  
                break; 
            }
            ++lcm;
        }
        
    }
}
