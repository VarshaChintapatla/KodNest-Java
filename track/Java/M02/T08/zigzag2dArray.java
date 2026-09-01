package track.Java.M02.T08;

import java.util.Scanner;

class Zigzag2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int row = sc.nextInt();

        int[][] arr = new int[row][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
        System.out.println("enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements are:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "	");
            }
            System.out.println();
        }
        sc.close();

    }

}
