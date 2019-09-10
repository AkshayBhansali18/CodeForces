import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int k=Integer.parseInt(sc.nextLine());
        String str[]=sc.nextLine().split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int sum=0;
        int count=0;
        int j=arr.length-1;
        while(sum<k&&j>=0)
        {
            sum=sum+arr[j--];
            count=count+1;
        }
        if(sum<k)
            System.out.println(-1);
        else
        System.out.println(count);

    }
}