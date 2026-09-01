package track.Java.M03.T02;

import java.util.Scanner;

public class changearraysize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = new int[n + 1];
        System.out.println("enter the index ");
        int index = sc.nextInt();
        System.out.println("enter the value");
        int value = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {

            if (index == i) {
                b[j] = value;
                System.out.print(b[j] + " ");
                j++;
            }
            b[j] = a[i];
            System.out.print(b[j] + " ");
            j++;
        }
        sc.close();

    }
}
