import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        int target = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            arr.add(ele);
        }
        
        int dp[] = new int[target+1];
        dp[0] = 0;
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1;i <= target; i++) {
            for (int ele: arr) {
                if (ele <= i) {
                    if (dp[i-ele] != Integer.MAX_VALUE) {
                        
                    
                    dp[i] = Math.min(dp[i], 1+dp[i-ele]);
                    }
                }
            }
            // System.out.println(i+"index ----*"+dp[i]);
        }
        
        if (dp[target] == Integer.MAX_VALUE) {       
            System.out.println(-1);
        } else {
            System.out.println(dp[target]);
        }
    }
}
