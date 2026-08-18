package track.Java.M02.T07Arrays;

public class maxmin {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);

        int min = a[0];
        for (int i = 0; i < 5; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);

    }
}
