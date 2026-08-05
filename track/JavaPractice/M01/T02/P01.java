package track.JavaPractice.M01.T02;

public class P01 {
    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        if (marks >= 60 && attendance >= 75 && activeBacklog) {
            System.out.println("Placement Ready");
        } else if (marks < 60) {
            System.out.println("Improve Eligibility");
        } else if (marks >= 60 && !projectCompleted) {
            System.out.println("Complete the project");
        } else if (projectCompleted && mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        }
    }
}
