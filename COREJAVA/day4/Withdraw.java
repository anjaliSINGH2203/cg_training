import java.util.*;

class Withdraw {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int actualPin = 4258;
        int totalBalance = 90000;

        System.out.print("Please enter your 4-digit PIN: ");
        int pin = sc.nextInt();

        if (pin == actualPin) {
            System.out.println("** Welcome to your BANK ACCOUNT **");

            System.out.print("Enter amount to withdraw (100s or 1000s only): ");
            int withdrawAmt = sc.nextInt();

            if (withdrawAmt % 100 == 0) {
                if (withdrawAmt <= totalBalance) {
                    totalBalance -= withdrawAmt;
                    System.out.println(withdrawAmt + " WITHDRAWN SUCCESSFULLY");
                    System.out.println("Remaining Balance: " + totalBalance);
                } else {
                    System.out.println("INSUFFICIENT BALANCE");
                }
            } else {
                System.out.println("Please enter amount in multiples of 100 or 1000 only");
            }

        } else {
            System.out.println("INVALID PIN NUMBER!");
        }

        sc.close();
    }
}
