import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();
        int map = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            int c = s.charAt(i)-'a';
            if((map&(1<<c)) != 0)
            {
                r.append(s.charAt(i));
            }
            else
            {
                map = map | (1<<c);
            }
        }
        for(int i=0;i<r.length();i++)
        {
            System.out.print(r.charAt(i)+ " ");
        }
    }
}
        
        

