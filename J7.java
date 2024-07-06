import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = number1.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even number");
        } else {
            System.out.println(num1 + " is odd number");
        }
    }
    
}
