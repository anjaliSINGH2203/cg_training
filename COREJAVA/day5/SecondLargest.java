//WAJP to find second Largest.




import java.util.*;

class SecondLargest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {
            int rem = n % 10;

            if (rem > largest) {
                secondLargest = largest;
                largest = rem;
            } 
            else if (rem > secondLargest && rem != largest) {
                secondLargest = rem;
            }

            n /= 10;
        }

        if (secondLargest == -1)
            System.out.println("Second largest digit not found");
        else
            System.out.println("Second Largest Digit = " + secondLargest);
    }
}
