package track.Java.M02.t03;

import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double rent = sc.nextDouble();
        double food = sc.nextDouble();
        double travel = sc.nextDouble();
        double total = rent + food + travel;
        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + (income - total));
        System.out.print("Status: ");
        if (income - total >= 0) {
            System.out.println("Within budget");
        } else {
            System.out.println("Over budget");

        }
        sc.close();

    }
}
