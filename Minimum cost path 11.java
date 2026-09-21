import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m;  j++) {
                mat[i][j] = sc.nextInt();
            }
        }
                
        
        int dp[][] = new int[n][n];
        
        dp[0][0] = mat[0][0];
        // System.out.println("target"+n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    int val = mat[i][j];
                if (i == 0&&j==0) {
                    dp[0][0] =mat[0][0];
                    // System.out.println("mat[0][0]"+dp[0][0]);
                } else {
                    if (i==0) {
                        dp[i][j] = val+dp[i][j-1];
                    } else if (j == 0) {
                        dp[i][j] = val + dp[i-1][j];
                    } else {
                        dp[i][j] = val + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]));
                    }
                }
                // System.out.print(dp[i][j]+"^^^^^");
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
