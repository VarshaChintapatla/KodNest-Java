package track.Java.M02.t05;

import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class P02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the name and two numbers
        String name = sc.next();
        int first = sc.nextInt();
        int second = sc.nextInt();

        // Create one object
        MethodDemo m = new MethodDemo();

        // Call all four methods
        m.sayHello();
        m.greet(name);

        int lucky = m.getLuckyNumber();
        int sum = m.add(first, second);

        System.out.println("Lucky Number: " + lucky);
        System.out.println("Sum: " + sum);

        sc.close();
    }
}