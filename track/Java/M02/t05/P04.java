package track.Java.M02.t05;

import java.util.Scanner;

class Students {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }
}

public class P04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the name
        String name = sc.nextLine();

        // Create one Student object
        Students s = new Students();

        // Call setName() and displayName()
        s.setName(name);
        s.displayName();
        sc.close();
    }
}