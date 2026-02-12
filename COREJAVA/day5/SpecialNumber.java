import java.util.*;

class SpecialNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }

        if (sum == temp)
            System.out.println(temp + " is a Special Number");
        else
            System.out.println(temp + " is NOT a Special Number");
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
