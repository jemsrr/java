import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {
        Scanner alphabet = new Scanner(System.in);
        System.out.print("Enter a one Alphabet = ");
        char ch = alphabet.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
