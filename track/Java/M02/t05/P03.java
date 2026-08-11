package track.Java.M02.t05;

import java.util.Scanner;

class StudentUtility {

    // Create the four required methods

    void report() {
        System.out.println("Student Performance Report");
    }

    void display(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double pass() {
        return 60.0;
    }

    double per(int java, int sql) {
        double percentage = (double) (java + sql) / 2;
        return percentage;
    }
}

public class P03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        // Read input
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int java = sc.nextInt();
        int sql = sc.nextInt();

        // Call methods
        utility.report();
        utility.display(id, name);

        double passing = utility.pass();
        double perres = utility.per(java, sql);

        System.out.println("Percentage: " + perres);

        if (perres >= passing) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        sc.close();
    }
}