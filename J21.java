import java.util.Scanner;

public class J21 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int num = number.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
