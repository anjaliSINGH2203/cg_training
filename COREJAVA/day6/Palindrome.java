import java.util.*;

class Palindrome {

    // Method returning String
    public static String palinString(int n) {
        int temp = n;
        int s = 0;

        while (n > 0) {
            int rem = n % 10;
            s = s * 10 + rem;
            n = n / 10;
        }

        return temp == s ? "Palindrome": "Not Palindrome";
    }

    // Method returning boolean
    public static boolean palinBool(int num) {
        int temp = num;
        int s = 0;

        while (num > 0) {
            int rem = num % 10;
            s = s * 10 + rem;
            num = num / 10;
        }

        return temp == s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(palinString(n));
        System.out.println(palinBool(n));
    }
}
