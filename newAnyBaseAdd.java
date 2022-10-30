import java.util.*;

public class spanArray{

    public static Scanner scn = new Scanner (System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static int maximum(int[] arr) {
        int maxEle = -(int)1e9;
        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);
        }
        return maxEle;
    }

    public static int minimum(int[] arr) {
        int minEle = (int)1e9;
        for(int ele : arr) {
            minEle = Math.min(minEle, ele);
        }
        return minEle; 
    }

    public static void span(int[] arr) {
        int span = 0;
        int max = maximum(arr);
        int min = minimum(arr);
        span = max - min;
        System.out.println(span);
    }

    public static void main (String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        maximum(arr);
        minimum(arr);
        span(arr);
    }
}
