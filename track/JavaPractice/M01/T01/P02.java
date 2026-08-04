public class P02 {
    public static void main(String[] args) {

        double solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double v = solvedProblems / practiceDays;

        boolean a;

        System.out.println("Report Value: " + solvedProblems);
        System.out.println("Whole Percentage: " + (int) exactPercentage);
        System.out.println("Average Per Day: " + v);

        if (v >= 9) {
            a = true;
        } else {
            a = false;
        }

        System.out.println("Daily Target Reached: " + a);
    }
}
