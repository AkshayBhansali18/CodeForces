import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str[]=sc.nextLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int time=Integer.parseInt(str[1]);
        int a[]=new int[n];
       String s[]=sc.nextLine().split(" ");
       int sum=0;
       int flag=0;
       int count=0;
       for(int i=0;i<n;i++)
       {
           a[i]=Integer.parseInt(s[i]);
           if(sum+a[i]<=time)
           {
               sum=sum+a[i];
           }
           else
           {
           flag=1;
           break;
           }
         
          if(i<n-1)
          {
              sum+=10;
              count=count+2;
          }
          
           
           }
          
           if(flag==1)
           System.out.println(-1);
           else if(flag==0)
           {
           count+=((time-sum)/5);
           System.out.println(count);
           }
    }
}