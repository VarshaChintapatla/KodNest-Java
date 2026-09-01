package track.Java.M02.T08;

import java.util.Scanner;

public class Array3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of blocks: ");
        int block = sc.nextInt();
        System.out.println("enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("enter number of columns: ");
        int col = sc.nextInt();

        int[][][] arr = new int[block][row][col];
        System.out.println("enter the elements");
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements are:");

        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(arr[i][j][k] + "	");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();

    }

}
