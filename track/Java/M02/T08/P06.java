package track.Java.M02.T08;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            int t = 0;

            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                t = t + a[i][j];
            }

            System.out.println("Row " + (i + 1) + " total: " + t);
        }
        sc.close();
    }
}