import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=sc.nextLine();
        if(str.contains("AB"))
        {
           String str2= str.replaceFirst("AB","");
            if(str2.contains("BA"))
            {
                System.out.println("YES");
                return;
            }

        }
        if(str.contains("BA"))
        {
        String str3=str.replaceFirst("BA","");
        if(str3.contains("AB"))
        {
            System.out.println("YES");
            return;
        }
    }
        System.out.println("NO");

    }
}