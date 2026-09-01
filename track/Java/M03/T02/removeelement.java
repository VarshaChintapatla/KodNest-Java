package track.Java.M03.T02;

import java.util.Scanner;

public class removeelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = new int[n + 1];

        System.out.println("enter the value");
        int value = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {

            if (value == a[i]) {
                j++;
                continue;
            }
            b[j] = a[i];
            System.out.print(b[j] + " ");
            j++;
        }
        sc.close();

    }
}
