import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        Scanner length =new Scanner(System.in);
        System.out.print("Enter length of fibonacci series: ");
        int n = length.nextInt();
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(n1+" ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            

        }
        
    }
}
