import java.util.*;

class HotelMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================Welcome to lovely's VEG & NON-VEG RESTAURANT=======================");
        System.out.println("Press 1 for VEG and press 2 for NON-VEG");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("1. DAL RICE      200");
            System.out.println("2. ALOO PARATHA  150");
            System.out.println("3. PALAK PANEER  100");
            System.out.println("4. MASALA DOSA   110");
        } 
        else if (choice == 2) {
            System.out.println("1. MUTTON        200");
            System.out.println("2. CHICKEN       150");
            System.out.println("3. PRAWNS        100");
            System.out.println("4. FISH CURRY    110");
        } 
        else {
            System.out.println("Invalid Choice");
            return;
        }

        System.out.println("Choose dish number:");
        int item = sc.nextInt();

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        double total_price = 0;
        double final_price = 0;

        if (item == 1)
            total_price = 200 * quantity;
        else if (item == 2)
            total_price = 150 * quantity;
        else if (item == 3)
            total_price = 100 * quantity;
        else if (item == 4)
            total_price = 110 * quantity;
        else {
            System.out.println("Item not available");
            return;
        }

        if (quantity >= 3) {
            System.out.println("CONGRATULATIONS! 20% DISCOUNT APPLIED");
            final_price = total_price - (total_price * 0.20);
        } else {
            final_price = total_price;
        }

        System.out.println("------------ INVOICE ------------");
        System.out.println("Item Number : " + item);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Final Price : " + final_price);
    }
}
