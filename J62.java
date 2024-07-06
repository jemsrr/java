import java.util.Scanner;

public class J62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(str + " string is a " + isNullEmpty(str));
        sc.close();
    }

    public static String isNullEmpty(String str) {
        if (str == null) {
            return "NULL";
        } if (str.trim().isEmpty()) {
            return "EMPTY";
        } else {
            return "neither NULL nor EMPTY";
        }
    }
}
