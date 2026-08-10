package track.Java.M02.to4;

import java.util.Scanner;

class PracticeProfile {
    // Declare name and points
    String name;
    int points;

}

public class P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PracticeProfile live = new PracticeProfile();
        PracticeProfile alias = live;

        live.name = sc.next();
        live.points = sc.nextInt();
        int boost = sc.nextInt();
        alias.points += boost;
        alias.points = alias.points > 100 ? 100 : alias.points;

        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;
        live.points -= sc.nextInt();
        live.points = live.points < 0 ? 0 : live.points;

        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);
        sc.close();
    }

}