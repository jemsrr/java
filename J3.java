import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = number1.nextFloat();

        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        float num2 = number2.nextFloat();

        float sum = num1 * num2;

        System.out.println(num1 + "*" + num2 + "=" + sum);
    }
}
