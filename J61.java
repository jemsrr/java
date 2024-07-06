import java.util.Scanner;
import java.util.stream.IntStream;

public class J61 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a find value: ");
        int N = sc.nextInt();

        boolean foound = IntStream.of(arr).anyMatch(n -> n == N);

        if (foound) {
            System.out.println(N + " is found.");
        } else {
            System.out.println(N + " is not found.");
        }
    }
}
