import java.util.*;

public class binomial {

    public static Scanner scn = new Scanner(System.in);

    public static void binomialPattern(int i) {
        for (int n = 0; n < i; n++) {
            int nCr = 1;
            for (int r = 0; r <= n; r++) {
                System.out.print(nCr + "\t");
                int nCr1 = ((n - r) * nCr / (r + 1));
                nCr = nCr1;
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        binomialPattern(scn.nextInt());
    }
}

// logic is :-

// in this pattern the relation between all digits in a row is
// "nCr" & "nCr+1" P & C
// where we considered n as row in loop and r as column.
