import java.util.Scanner;

class CheckUpper {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char a = sc.next().charAt(0);

        // Check if alphabet
        if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {

            // Check uppercase
            if (a >= 'A' && a <= 'Z') {
                System.out.println("THE CHARACTER IS IN UPPERCASE");
            } else {
                System.out.println("THE CHARACTER IS IN LOWERCASE");
            }

        } else {
            System.out.println("INVALID INPUT (Not an alphabet)");
        }
    }
}
