import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            if(n==0 || n == 1)
            {
                break;
            }
            else
            {
                fact *= i;
            }
        }
        System.out.print(fact);
    }
}
