import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter number 1 = ");
        float num1 = num.nextFloat();
        System.out.print("Enter number 2 = ");
        float num2 = num.nextFloat();
        System.out.print("Enter number 3 = ");
        float num3 = num.nextFloat();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " ia the largest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " ia the largest number");
        } else {
            System.out.println(num3 + " ia the largest number");
        }
    }
}
