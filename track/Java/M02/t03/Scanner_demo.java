package track.Java.M02.t03;

import java.util.*;

public class Scanner_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Byte Value: ");
        byte a = sc.nextByte();
        System.out.println("Byte Value: " + a);

        System.out.print("Enter Long Value: ");
        long b = sc.nextLong();
        System.out.println("Long Value: " + b);

        System.out.print("Enter Short Value: ");
        short c = sc.nextShort();
        System.out.println("Short Value: " + c);

        System.out.print("Enter Int Value: ");
        int d = sc.nextInt();
        System.out.println("Int Value: " + d);

        System.out.print("Enter float Value: ");
        float e = sc.nextFloat();
        System.out.println("Float Value: " + e);

        System.out.print("Enter double Value: ");
        double f = sc.nextDouble();
        System.out.println("Double Value: " + f);

        System.out.print("Enter boolean Value: ");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean Value: " + g);

        System.out.print("Enter Char Value: ");
        char h = sc.next().charAt(0);
        System.out.println("Char Value: " + h);

        System.out.print("Enter word: ");
        String w = sc.next();
        System.out.println("word: " + w);

        sc.nextLine();
        System.out.println("Enter Line: ");
        String s = sc.nextLine();
        System.out.println("Line: " + s);
        sc.close();

    }

}
