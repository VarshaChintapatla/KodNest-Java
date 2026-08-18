package track.Java.M02.T07Arrays;

public class P07 {
    public static void main(String[] args) {

        int[] readings = { 12, 14, 16, 18 };
        int index = 2;
        int value = 25;

        System.out.print("Snapshot: ");

        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }

        System.out.println();

        readings[index] = value;

        System.out.print("Updated: ");

        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}