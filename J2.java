import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int num2 = number2.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + "+" + num2 + "=" + sum);
    }
}
