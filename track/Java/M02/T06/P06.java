package track.Java.M02.T06;

import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobilePlan m1 = new MobilePlan();
        MobilePlan m2 = new MobilePlan(sc.nextLine(), sc.nextInt());

        m1.display();
        m2.display();

        sc.close();
    }
}