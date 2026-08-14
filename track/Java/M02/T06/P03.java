package track.Java.M02.T06;

import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read product name
        String name = sc.nextLine();

        // Read product price
        double price = sc.nextDouble();

        // Create Product object
        Product p = new Product(name, price);

        // Display product details
        p.display();

        sc.close();
    }
}
