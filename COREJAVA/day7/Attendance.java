import java.util.*;

class Attendance {

    public static void validateAttendance(boolean[] attendance, String[] students, String[] reason) {

        int presentCount = 0, absentCount = 0;

        System.out.println("\nTotal students present:");
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                presentCount++;
                System.out.println(students[i]);
            }
        }

        System.out.println("\nTotal students absent:");
        for (int i = 0; i < attendance.length; i++) {
            if (!attendance[i]) {
                absentCount++;
                System.out.println(students[i] + " (Reason: " + reason[i] + ")");
            }
        }

        System.out.println("\nPresent Count: " + presentCount);
        System.out.println("Absent Count: " + absentCount);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String students[] = {
            "Shivani Sunarkari", "Anjali Singh", "Shivkumar H R", "Shanu",
            "Mighty Raju", "Chota Bheem", "Nobita Nobisuge",
            "Tony Stark", "Dr. Doom", "Stitch"
        };

        boolean attendance[] = new boolean[students.length];
        String reason[] = new String[students.length];

        System.out.println("==================== WELCOME TO ATTENDANCE MANAGEMENT SYSTEM ====================\n");
        System.out.println("Enter 1 for Present or 0 for Absent\n");

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " : ");
            String input = sc.nextLine();   

            if (input.equals("1")) {
                attendance[i] = true;     //denotes the present student

            } else {
                attendance[i] = false;
                System.out.print("Please state the reason: "); // reason
                reason[i] = sc.nextLine();
            }
        }

        System.out.println("\n======================= STUDENTS ATTENDANCE RECORD ===============================");

        validateAttendance(attendance, students, reason);
        sc.close();
    }
}
