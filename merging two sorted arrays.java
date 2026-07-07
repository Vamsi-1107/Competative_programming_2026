import java.io.*;
import java.util.*;

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
        int m = sc.nextInt();
        int b[]=new int[m];
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();         
        }
        int c[]=new int[n+m];
         int k=0;
         int i=0;
         int j=0;      
        while(i<n && j<m)
        {
            if(a[i]<= b[j])
            {
              c[k++]=a[i++];  
            }
           else
            {
                c[k++]=b[j++];
            }
        }
            while(i<n)
            {
                c[k++]=a[i++];
            }
            while(j<m)
            {
                c[k++]=b[j++];
            }
        
        for (k=0;k<(n+m);k++)
        {
            System.out.print(c[k]+" ");     
        }
    }
}
