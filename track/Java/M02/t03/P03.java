package track.Java.M02.t03;

import java.util.*;

public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        double a = sc.nextDouble();
        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + n);
        System.out.println("Assessment: " + a);

        sc.close();

    }

}