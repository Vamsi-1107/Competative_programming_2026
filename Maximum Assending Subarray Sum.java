import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int i=0;
        while(i<n)
        {
            int total = a[i];
            int ct = 0;
            int j=i+1;
            while(j<n && a[j]>a[j-1])
            {
                
                total += a[j];
                j++;
                ct++;
            } 
            
            if(max<total)
            {
                max = total;    
            }         
           i=i+ct+1; 
        }
        System.out.print(max);
        
            
    }
}
