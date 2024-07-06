import java.util.Scanner;

public class J32 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = num.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = num.nextInt();
        System.out.print("Enter a operator = ");
        char op = num.next().charAt(0);
        int result;

        switch (op) {
            case '+':
                result = n1 + n2;
                System.out.println(result);
                break;

                case '-':
                result = n1 - n2;
                System.out.println(result);
                break;

                case '*':
                result = n1 * n2;
                System.out.println(result);
                break;

                case '/':
                result = n1 / n2;
                System.out.println(result);
                break;
        
            default:
            System.out.println("Invalid");
                break;
        }
        num.close();
    }
}
