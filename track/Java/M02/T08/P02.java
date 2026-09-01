package track.Java.M02.T08;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Element to search
        int e = sc.nextInt();
        boolean found = false;

        // Search for the element
        for (int i = 0; i < n; i++) {
            if (a[i] == e) {
                found = true;
                break;
            }
        }

        // Display search result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Print array in reverse order
        System.out.print("Reverse order: ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}