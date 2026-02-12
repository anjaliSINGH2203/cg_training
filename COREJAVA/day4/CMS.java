//college management system

import java.util.*;
class CMS{
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------WELCOME TO COLLEGE MANAGEMENT SYSTEM--------------------");
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("Please enter your name and password to login:");
    String name, password;
    System.out.print("Name: ");
    name = sc.nextLine();
    System.out.print("Password: ");
    password = sc.nextLine();

    if(name.equals( "Admin") && password.equals("admin1234")){
        System.out.println("------Admin---------------------Login successful!! Welcome " + name+"------------------------------");
        System.out.println();
        System.out.println(" Which task do you want to perform?");
        System.out.println("1. View Profile");
        System.out.println("2. View Courses");
        System.out.println("3. View Attendance");
        System.out.println("4. View Marks");
        System.out.println("5. View Fee Status");
        System.out.println("6. Logout");

    System.out.println();
    System.out.println();

    System.out.print("Enter your choice (1-6): ");
    int choice = sc.nextInt();
    switch(choice){ 
        case 1: 

            System.out.println("-----------------------------------Profile Details-----------------------------------");
            System.out.println("Name: Admin\nRegistration Number: 12214578\nCourse: B.Tech\n Stream: Computer Science\nYear: 4th Year\nSemester: 8th Semester\n CGPA: 8.5");
            break;

        case 2:
            System.out.println("-----------------------------------Courses Enrolled-----------------------------------");
            System.out.println("1. Data Structures and Algorithms\n2. Database Management Systems\n3. Operating Systems\n4. Computer Networks\n5. Software Engineering");
            break;
        case 3:
            System.out.println("-----------------------------------Attendance Details-----------------------------------");
            System.out.println("Data Structures and Algorithms: 85%\nDatabase Management Systems: 90%\nOperating Systems: 80%\nComputer Networks: 88%\nSoftware Engineering: 92%");
            break;
        case 4:
            System.out.println("-----------------------------------Marks Details-----------------------------------");
            System.out.println("Data Structures and Algorithms: 88\nDatabase Management Systems: 92\nOperating Systems: 85\nComputer Networks: 90\nSoftware Engineering: 95");
            break;
        case 5:
            System.out.println("-----------------------------------Fee Status-----------------------------------");
            System.out.println("Total Fee: $10,000\nPaid: $7,500\nDue: $2,500");
            break;
        case 6:
            System.out.println("You have been logged out. Thank you!");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }



    }else{
        System.out.println("Invalid credentials. Please try again.");
    }
    
    sc.close();
}}