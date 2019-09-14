import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<String> ip=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int s=Integer.parseInt(str[1]);
        String str2[]=br.readLine().split(" ");
        int count=1;
        int a[]=new int[n];
        a[0]=Integer.parseInt(str2[0]);
        for(int i=1;i<n;i++)
        {
            a[i]=Integer.parseInt(str2[i]);
            if(a[i]-a[i-1]>s)
                count=1;
            else
                count+=1;
        }
        System.out.println(count);

    }
}