import java.util.Scanner;

class ReadInput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter your address:");
        String address = sc.nextLine();

        System.out.println("Enter your regNo:");
        int regNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter your course:");
        String course = sc.nextLine();

        System.out.println("Enter your semester:");
        int sem = sc.nextInt();

        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("Enter your contact number:");
        long contactNo = sc.nextLong();

        System.out.println("Enter your Superset ID:");
        int supersetId = sc.nextInt();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + sem);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Contact Number: " + contactNo);
        System.out.println("Superset ID: " + supersetId);

        sc.close();
    }
}
