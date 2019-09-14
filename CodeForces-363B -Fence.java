import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str[]=sc.nextLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        ArrayList<Integer> ind=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        int min= IntStream.of(Arrays.copyOfRange(a,0,m)).sum();
        int indice=1;
        int j=1;
        for(int i=m;i<s.length;i++)
        {

            a[i]=Integer.parseInt(s[i]);
            int sumval=IntStream.of(Arrays.copyOfRange(a,j,j+m)).sum();
            if(sumval<min)
            {
                min=sumval;
                indice=j+1;

            }
            j=j+1;
        }
        System.out.println(indice);


    }
}