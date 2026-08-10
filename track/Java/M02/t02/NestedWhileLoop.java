package track.Java.M02.t02;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;

            }
            i++;
            System.out.println();

        }
    }
}
