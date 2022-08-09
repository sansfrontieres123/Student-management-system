import java.util.Scanner;

public class Student {
    
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 500;
    private static int id = 100;

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("1 - Freshman\n2 - for Sophmore\n3 - Junior\n4 - Senior\n Enter student class level: ");
        this.gradeYear = scan.nextInt();
        
        setStudentID();
        
        

    }  

    private void setStudentID() {
        id++;
        this.studentID =  gradeYear + " " + id;
    }

    public void enroll() {
        do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner scan = new Scanner(System.in);
        String course = scan.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        } 
        else { break; }  
    } while (1 != 0);
         
    }

    public void viewBalance() {
        System.out.println("Your balance is: €" + tuitionBalance);

    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: €");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of €" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + 
            "\nGrade level: " + gradeYear +
            "\nStudent ID: " + studentID + 
            "\nCourses Enrolled: " + courses + 
            "\nBalance: €" + tuitionBalance;
    }
}
