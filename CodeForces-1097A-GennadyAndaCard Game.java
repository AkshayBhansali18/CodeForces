import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=sc.nextLine();
        String ip=sc.nextLine();
        
        ip.replaceAll("\\s","");
        ArrayList<Character> list=new ArrayList<>();
        char ch[]=ip.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            list.add(ch[i]);
        }
        if(list.contains(str.charAt(0))||list.contains(str.charAt(1)))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}