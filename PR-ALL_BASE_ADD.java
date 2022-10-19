import java.util.*;

public class DTA {

    public static Scanner scn = new Scanner(System.in);

    public static int anybaseReturn(int n, int b) {
        int ans = 0;
        int pow = 1;

        while (n != 0) {
            int r = n % b;
            n = n / b;

            ans += r * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = anybaseReturn(scn.nextInt(), scn.nextInt());
        System.out.print(a);
    }

}
