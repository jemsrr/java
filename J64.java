import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class J64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of milliseconds: ");
        long milliseconds = sc.nextLong();
        sc.close();

        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);

        System.out.println(seconds);
        System.out.println(minutes);
    }
}
