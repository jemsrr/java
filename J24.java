import java.util.Scanner;

public class J24 {
    public static void main(String[] args) {
        Scanner stri = new Scanner(System.in);
        System.out.print("Enter your string");
        String str = stri.nextLine();
        String restr = "";
        int strlength = str.length();

        for (int i = (strlength - 1); i >= 0; --i) {
            restr = restr + str.charAt(i);
        }
        if (str.toLowerCase().equals(restr.toLowerCase())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome"); 
        }

    }
}
