import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long n=Long.parseLong(sc.nextLine());
        String str[]=sc.nextLine().split(" ");
        ArrayList<Long> ip=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            ip.add(Long.parseLong(str[i]));
        }
        long max=Collections.max(ip);
        long min=Collections.min(ip);
        System.out.print(max-min+" ");
            long freq_max = Collections.frequency(ip, max);
            long freq_min = Collections.frequency(ip, min);
            long occ=0;
        if(max!=min)
         occ=freq_max*freq_min;
        else
            occ=freq_max*(freq_max-1)/2;

        System.out.println(occ);





    }
}