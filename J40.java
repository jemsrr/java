import java.util.Scanner;

public class J40 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = str.nextLine();
        str.close();
        String newstr = reverseString(s);
        System.out.println(newstr);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
