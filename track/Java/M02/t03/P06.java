package track.Java.M02.t03;

import java.util.*;

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
        }
        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + (double) total / n);
        System.out.print("Status: ");
        if ((double) total / n >= 5) {
            System.out.println("Consistent");
        } else {
            System.out.println("Needs consistency");
        }
        sc.close();

    }

}
