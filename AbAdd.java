import java.util.*;

public class AbAdd {

    public static Scanner scn = new Scanner(System.in);

    // public static int addition(int n1, int n2, int b) {
    //     int ans = 0;
    //     int pow = 1;
    //     int carry = 0;

    //     while (n1 != 0 || n2 != 0 || carry != 0) {
    //         int r1 = n1 % 10;
    //         int r2 = n2 % 10;
    //         n1 = n1 / 10;
    //         n2 = n2 / 10;

    //         int sum = r1 + r2 + carry;
    //         int digit = sum % b;
    //         carry = sum / b;

    //         ans += digit * pow;
    //         pow = pow * 10;
    //     }
    //     return ans;
    // }

    public static int AbAddition (int n1, int n2, int b) {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = carry + (n1 % 10) + (n2 % 10);
            n1 /= 10;
            n2 /= 10;

            int digit = sum % b;
            carry = sum / b;

            ans += digit * pow;
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int add = AbAddition(n1, n2, b);
        System.out.print(add);
    }
}
