package track.Java.M02.t03;

import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the range and analyze its numbers
        int start = sc.nextInt();
        int end = sc.nextInt();
        int evensum = 0;
        int oddcount = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddcount += 1;
            }
        }
        System.out.println("Even sum: " + evensum);
        System.out.println("Odd count: " + oddcount);
        sc.close();
    }
}
