package track.Java.M02.T08;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int c = 0;
        int t = sc.nextInt();

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                c = c + 1;
            }
        }

        System.out.println("Frequency of " + t + ": " + c);
        sc.close();
    }
}