import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        int x1 = 1, x2 = 0;
        int y1 = 0, y2 = 1;

        while (b != 0) 
        {
            int q = a / b;
            int r = a % b;

            int x = x1 - q * x2;
            int y = y1 - q * y2;

            a = b;
            b = r;

            x1 = x2;
            x2 = x;

            y1 = y2;
            y2 = y;
        }

        System.out.println(x1+" "+y1+" "+a);
       
    }
}

