package track.Java.M02.T08;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Read elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Assume first element is both minimum and maximum
        int max = a[0];
        int min = a[0];

        // Find minimum and maximum
        for (int i = 1; i < n; i++) {

            if (max < a[i]) {
                max = a[i];
            }

            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        sc.close();
    }
}