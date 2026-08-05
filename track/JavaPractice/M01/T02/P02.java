package track.JavaPractice.M01.T02;

public class P02 {
    public static void main(String[] args) {

        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName;

        switch (roundCode) {
            case 1:
                roundName = "Aptitude Score";
                break;

            case 2:
                roundName = "Technical Round";
                break;

            case 3:
                roundName = "HR Round";
                break;

            case 4:
            case 5:
                roundName = "Final Review";
                break;

            default:
                roundName = "Invalid Round";
                break;
        }

        System.out.println("Current Round: " + roundName);

        String ava = attemptsUsed < maxAttempts
                ? "Attempt Available"
                : "Attempt Limit Reached";

        // Use "status" (lowercase s) if that's what the expected output requires.
        System.out.println("Attempt status: " + ava);
    }
}