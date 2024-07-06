import java.util.Scanner;

public class J30 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter low value : ");
        int low = num.nextInt();
        System.out.print("Enter high value : ");
        int high = num.nextInt();

        for (int i = low ; i <= high; i++) {
            if (armStrongnum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean armStrongnum(int n) {
        int r = 0;
        int c = 0;
        int o = n;

        while (o != 0) {
            o /= 10;
            ++c;
        }
        o = n;

        while (o != 0) {
            int m = o % 10;
            r += Math.pow(m, c);
            o /= 10;
        }
        if (r == n) {
            return true;
        }
        return false;
    }
}
