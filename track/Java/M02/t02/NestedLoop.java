package track.Java.M02.t02;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

}
