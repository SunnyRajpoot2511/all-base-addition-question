import java.util.*;

public class diagonalPrint {

    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void diagonal (int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++ , j++) {
                System.out.println(arr[i][j] + " ");
                System.out.println(i + " , " + j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        diagonal(arr);
    }
}
