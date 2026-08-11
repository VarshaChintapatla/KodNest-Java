package track.Java.M02.t04;

import java.util.Scanner;

class Student {
    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double score;

}

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student s1 = new Student();
        // Read and store all values in the object
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.course = sc.next();
        s1.score = sc.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.score);
        sc.close();
    }
}
