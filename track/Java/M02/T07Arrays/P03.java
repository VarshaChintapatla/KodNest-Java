package track.Java.M02.T07Arrays;

public class P03 {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50 };
        int bonus = 5;

        System.out.print("Updated values: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + bonus;
            System.out.print(a[i] + " ");
        }
    }
}
