package track.Java.M02.to4;

import java.util.Scanner;

class Learner {
    int id;
    String name;
    int score;
}

public class P04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner first = new Learner();
        first.id = sc.nextInt();
        first.name = sc.next();
        first.score = sc.nextInt();

        // Create and populate the second Learner object
        Learner second = new Learner();
        second.id = sc.nextInt();
        second.name = sc.next();
        second.score = sc.nextInt();

        // Read the new score
        int newScore = sc.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(first.id + " - " + first.name + " - " + first.score);
        System.out.println(second.id + " - " + second.name + " - " + second.score);

        // Update only the first object
        first.score = newScore;

        // Display both records after the update
        System.out.println("After Update");
        System.out.println(first.id + " - " + first.name + " - " + first.score);
        System.out.println(second.id + " - " + second.name + " - " + second.score);

        sc.close();
    }
}