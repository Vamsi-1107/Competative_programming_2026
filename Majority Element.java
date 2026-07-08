import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                   count++; 
                }
                if(count>max)
                {
                    max=count;
                    k = i;
                }
            }
            
        }
        int i=k;
        if(max>(n/2))
        {
            System.out.print(a[i]);
        }
        else
        {
            System.out.print(-1);
        }
        sc.close();
    }
}
