import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0) {
            System.out.println(b);
            return;
        }

        if (b == 0) {
            System.out.println(a);
            return;
        }

        int s = 0;

        while ((a & 1) == 0 && (b & 1) == 0) {
            a >>= 1;
            b >>= 1;
            s++;
        }

        while ((a & 1) == 0) {
            a >>= 1;
        }

        while (b != 0) {

            while ((b & 1) == 0) {
                b >>= 1;
            }

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            b = b - a;
        }

        a <<= s;

        System.out.println(a);
    }
}
