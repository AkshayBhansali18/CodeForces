import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s[]=sc.nextLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        HashMap<String,String> map=new HashMap<>();
        String str[][]=new String[m][2];
        int lengths[][]=new int[m][2];
        for(int i=0;i<m;i++)
        {
            str[i]=sc.nextLine().split(" ");
            lengths[i][0]=str[i][0].length();
            lengths[i][1]=str[i][1].length();
            if(lengths[i][0]>lengths[i][1])
                map.put(str[i][0],str[i][1]);
            else if(lengths[i][0]<=lengths[i][1])
                map.put(str[i][0],str[i][0]);
        }
        String val[]=sc.nextLine().split(" ");
        for(int i=0;i<val.length;i++)
        {
            System.out.print(map.get(val[i])+" ");
        }
    }
}