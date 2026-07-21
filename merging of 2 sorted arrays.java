import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++)
       {
            a[i] = sc.nextInt();
            
       }
       Arrays.sort(a);
       int m = sc.nextInt();
       int b[]= new int[m];
       for(int i=0;i<m;i++)
       {
            b[i] = sc.nextInt();
       }
       Arrays.sort(b);
       int i=0,j=0,k=0;
       int r[]=new int[m+n];
       while(i<n && j<m)
        {
            if(a[i]<= b[j])
            {
              r[k]=a[i];
              k++; i++;  
            }
           else
            {
                r[k]=b[j];
                k++; j++;
            }
        }
        while(i<n)
        {
            r[k]=a[i];
            k++;
            i++;
        }
        while(j<m)
        {
            r[k]=b[j];
            k++;
            j++;
        }
        if(k % 2 == 0)
        {
            long x = r[k/2 - 1];
            long y = r[k/2];
            System.out.printf("%.1f\n",(x+y)/2.0);
        }
        else
        {
            System.out.printf("%.1f\n",(double)r[k/2]);
        }
        sc.close();    
    }
}
