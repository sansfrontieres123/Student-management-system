import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        
        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        Student[] students = new Student[numberOfStudents];

        for(int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
            
        }

    }
}