package track.Java.M02.T08;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    c = c + 1;
                }
            }
        }

        System.out.println("Available seats: " + c);
        sc.close();
    }
}