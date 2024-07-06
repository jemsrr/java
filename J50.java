import java.util.Scanner;

public class J50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++vowels;
            } else if (c >= 'a' && c <= 'z') {
                ++consonants;
            } else if (c >= '0' && c <= '9') {
                ++digits;
            } else if (c == ' ') {
                ++spaces;
            }
        }
        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + consonants);
        System.out.println("digits = " + digits);
        System.out.println("spaces = " + spaces);
    }
}
