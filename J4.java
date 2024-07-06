import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner che = new Scanner(System.in);
        System.out.print("Enter a one chrecter: ");
        char ch = che.next().charAt(0);
        int ascii = ch;

        System.out.println(ascii);
    }
}
