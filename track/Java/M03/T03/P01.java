package track.Java.M03.T03;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = 0;
        int r = 0;

        while (r < a.length) {

            if (a[r] != 0) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
            }

            r++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}