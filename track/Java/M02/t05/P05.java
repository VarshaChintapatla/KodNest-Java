package track.Java.M02.t05;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store parameters in instance variables
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class P05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the full name and salary
        String name = sc.nextLine();
        double sal = sc.nextDouble();

        // Create one Employee object
        Employee e = new Employee();

        // Call setDetails() and displayDetails()
        e.setDetails(name, sal);
        e.displayDetails();

        sc.close();
    }
}
