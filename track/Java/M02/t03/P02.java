package track.Java.M02.t03;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            sum = sum + scanner.nextInt();
        }

        System.out.println("Total solved: " + sum);

        if (sum >= 20) {
            System.out.println("Status: Strong progress");
        } else if (sum >= 10 && sum <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }
        scanner.close();
    }
}