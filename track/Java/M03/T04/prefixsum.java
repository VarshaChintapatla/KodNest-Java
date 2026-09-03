package track.Java.M03.T04;

import java.util.*;

public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] p = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            p[i] = sum;
        }
        // we can use p[i]=a[i]+p[i-1];

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        sc.close();
    }
}
