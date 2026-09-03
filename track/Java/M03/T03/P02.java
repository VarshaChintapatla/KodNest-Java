package track.Java.M03.T03;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = 0;
        int r = n - 1;

        while (l < r) {

            if (a[l] % 2 != 0 && a[r] % 2 == 0) {

                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
                r--;

            } else {

                if (a[l] % 2 == 0) {
                    l++;
                }

                if (a[r] % 2 != 0) {
                    r--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}