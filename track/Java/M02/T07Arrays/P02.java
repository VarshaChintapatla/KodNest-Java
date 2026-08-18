package track.Java.M02.T07Arrays;

public class P02 {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };

        // Required variables
        int index = 1;
        int value = 25;
        int rindex = 4;

        // Create a separate array
        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // liveView refers to the same array as original
        int[] liveView = original;

        // Update through liveView
        liveView[index] = value;

        // Display original
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Display snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // Compare references
        System.out.print("Same object: ");
        if (original == liveView) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Validate requestedIndex before accessing original
        System.out.print("Requested value: ");

        if (rindex >= original.length || rindex < 0) {
            System.out.println("Invalid index");
        } else {
            System.out.println(original[rindex]);
        }
    }
}