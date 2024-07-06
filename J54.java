import java.util.Scanner;

public class J54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        // Example 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Example 2
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", k);
                k++;
            }
            System.out.println();
        }

        // Example 3
        char s = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s + " ");
            }
            s++;
            System.out.println();
        }

        // Example 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Example 5
        for (int i = n; i >= 1; i--) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", k);
                k++;
            }
            System.out.println();
        }

        // Example 6
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        // Example 7
        for (int i = 1; i <= n; i++) {
            int r = 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.printf("%d ",r);
            }
            System.out.println();
            r++;
        }
        
    }
}
