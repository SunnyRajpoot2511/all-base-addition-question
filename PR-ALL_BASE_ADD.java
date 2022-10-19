import java.util.*;

public class ATA {

    public static Scanner scn = new Scanner(System.in);

    public static int AbToDec(int n, int b) {
        int ans = 0;
        int pow = 1;

        while (n != 0) {
            int r = n % 10;
            n /= 10;

            ans += r * pow;         
            pow *= b;
        }
        return ans;
    }

    public static int DecToAb(int n, int b) {
        int ans = 0;
        int pow = 1;

        while (n != 0) {
            int r = n % b;
            n /= b;

            ans += r * pow;
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int returnDec = AbToDec(n, scn.nextInt());
        System.out.print(DecToAb(returnDec, scn.nextInt()));
    }
}
