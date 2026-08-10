package track.Java.M02.t02;

public class P01 {
    public static void main(String[] args) {

        int number = 5;
        int firstScore = 25;
        int secondScore = 20;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        if (firstScore >= secondScore) {
            System.out.println("First score is larger.");
        } else if (secondScore > firstScore) {
            System.out.println("Second score is larger.");
        }

    }
}
