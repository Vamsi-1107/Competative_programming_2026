import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong())
        {
            long N = sc.nextLong();
            int K = sc.nextInt();
            long result = N ^ (1L << K);
            System.out.println(result);
        }
    }
}
