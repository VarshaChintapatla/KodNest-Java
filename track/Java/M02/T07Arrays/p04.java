package track.Java.M02.T07Arrays;

import java.util.*;

public class p04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        System.out.println("Total: " + sum);
    }
}
