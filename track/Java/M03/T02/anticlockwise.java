package track.Java.M03.T02;

import java.util.Scanner;

public class anticlockwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the number of rotations");
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int t = a[n - 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

    }

}
