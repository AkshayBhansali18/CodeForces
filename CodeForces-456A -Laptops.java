import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=Integer.parseInt(sc.nextLine());
        String str1[]=sc.nextLine().split(" ");
        String str2[]=sc.nextLine().split(" ");
        int a1[]=new int[str1.length];
        int a2[]=new int[str2.length];
        for(int i=0;i<str1.length;i++)
        {
            a1[i]=Integer.parseInt(str1[i]);
            a2[i]=Integer.parseInt(str2[i]);
        }
        for(int i=0;i<a1.length-1;i++)
        {
            if(a1[i]<a1[i+1])
            {
                if(a1[i]-a2[i]<a1[i+1]-a2[i+1]) {
                    System.out.println("Happy Alex");
                    return;
                }
            }
            else if(a1[i]>a1[i+1])
            {
                if(a1[i]-a2[i]>a1[i+1]-a2[i+1]) {
                    System.out.println("Happy Alex");
                    return;
                }
            }
        }
        System.out.println("Poor Alex");


    }
}