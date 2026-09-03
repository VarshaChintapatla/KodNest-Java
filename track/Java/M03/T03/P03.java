package track.Java.M03.T03;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        // Validate l and r
        if (l < 0 || r >= n || l > r) {
            System.out.println(-1);
        } else {

            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
                r--;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}