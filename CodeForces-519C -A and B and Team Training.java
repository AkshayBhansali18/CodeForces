import java.util.*;
import java.io.*;
public class Solution
{
    static int c=0;
    public static void main(String args[]) throws IOException
    {
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int m=Integer.parseInt(str[0]);
        int n=Integer.parseInt(str[1]);
        count=recursive(m,n);
        System.out.println(count);

    }
    public static int recursive(int m,int n)
    {

        if(m<=1&&n<=1||m==0||n==0)
            return c;
        else if(m>n)
        {
            c=c+1;
            return recursive(m-2,n-1);
        }
        else
        {
            c=c+1;
            return recursive(m-1,n-2);
        }

    }
}