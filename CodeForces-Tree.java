import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a1[]=sc.nextLine().split(" ");
        String a2[]=sc.nextLine().split(" ");
        int a[]=new int[a1.length];
        int b[]=new int[a2.length];
        for(int i=0;i<a1.length;i++)
        {import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<String> ip=new ArrayList<>();
        String str[]=sc.nextLine().split(" ");
        String s1=str[0]+str[1];
        String s2=str[2]+str[3];
        ip.add("00");
        ip.add("01");
        ip.add("10");
        ip.add("11");
        if(ip.contains(s1))
            ip.remove(s1);
        if(ip.contains(s2))
            ip.remove(s2);
        if(ip.size()==3||ip.size()==4)
            System.out.println(-1);
        else
        {
            System.out.println(ip.get(0).charAt(0)+" "+ip.get(0).charAt(1)+" "+ip.get(1).charAt(0)+" "+ip.get(1).charAt(1));

        }

    }
}
           a[i]=(Integer.parseInt(a1[i]));
            b[i]=(Integer.parseInt(a2[i]));

        }

        int n=Integer.parseInt(sc.nextLine());
        int sum_a=IntStream.of(a).sum();
        int count;
        if(sum_a%5!=0) {
             count = (sum_a / 5) + 1;
        }
        else
            count=sum_a/5;
        if(count>n)
        {
            System.out.println("NO");
            return;
        }
        int sum_b=IntStream.of(b).sum();
       if(sum_b%10!=0)
        count+=(sum_b/10)+1;
       else
           count+=(sum_b/10);

        if(count<=n)
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}