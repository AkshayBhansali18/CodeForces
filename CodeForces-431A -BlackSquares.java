import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str[]=sc.nextLine().split(" ");
        HashMap<String,Integer> map=new HashMap<>();

        int n[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            n[i]=Integer.parseInt(str[i]);
            map.put(String.valueOf(i+1),n[i]);
        }
        int sum=0;
        String ip=sc.nextLine();
        for(int i=0;i<ip.length();i++)
        {
            sum=sum+(map.get(String.valueOf(ip.charAt(i))));
        }
        System.out.println(sum);

    }
}