import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            count+=1;
        }
        System.out.println(count);
    }
}