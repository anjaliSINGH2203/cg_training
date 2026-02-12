import java.util.*;

class Student {
    String name;
    int id;
    String gender;
    double marks;
    static String college = "LPU";

    // method to print student data
    void display() {
        System.out.println("College: "+ college);
        System.out.println(name);
        System.out.println(id);
        System.out.println(gender);
        System.out.println(marks);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[10];

        System.out.println("Enter the details of 10 students:\n");

        for (int i = 0; i < 10; i++) {
            arr[i] = new Student();

            System.out.println("Student " + (i + 1) + " Details:");

            System.out.print("Enter name: ");
            arr[i].name = sc.nextLine();

            System.out.print("Enter id: ");
            arr[i].id = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Enter gender: ");
            arr[i].gender = sc.nextLine();

            System.out.print("Enter marks: ");
            arr[i].marks = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
        }

        System.out.println("\nThe Student details are:\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            arr[i].display();
        }
    }
}
