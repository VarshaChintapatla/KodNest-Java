package track.Java.M02.T07Arrays;

public class P06 {
    public static void main(String[] args) {

        int[] stock = { 4, 12, 2, 9, 5 };
        int reorder = 5;
        int c = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= reorder) {
                c = c + 1;
            }
        }

        System.out.println("Items to reorder: " + c);
    }
}