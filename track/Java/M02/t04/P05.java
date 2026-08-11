package track.Java.M02.to4;

import java.util.Scanner;

class Student {
    // Declare registrationId, name and attendancePercentage
    int id;
    String name;
    double attendance;
}

public class P05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent
        Student first = new Student();
        first.id = sc.nextInt();
        first.name = sc.next();
        first.attendance = sc.nextDouble();

        // Create and populate secondStudent
        Student second = new Student();
        second.id = sc.nextInt();
        second.name = sc.next();
        second.attendance = sc.nextDouble();

        // Read the selected ID and new attendance
        int select = sc.nextInt();
        double per = sc.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (first.id == select) {
            selectedStudent = first;
        } else if (second.id == select) {
            selectedStudent = second;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendance = per;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(first.id + " - " + first.name + " - " + first.attendance + "%");
        System.out.println(second.id + " - " + second.name + " - " + second.attendance + "%");

        sc.close();
    }
}