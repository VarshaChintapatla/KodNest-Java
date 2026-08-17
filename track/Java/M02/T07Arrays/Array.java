package track.Java.M02.T07Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }

}
