package track.Java.M02.T06;

import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full name
        String name = sc.nextLine();

        // Create one Student object
        Student s = new Student(name);

        // Display student name
        s.display();

        sc.close();
    }
}