import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = number1.nextFloat();

        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        float num2 = number2.nextFloat();

        float temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Enter number 1: " + num1);
        System.out.println("Enter number 2: " + num2);
    }
    
}
