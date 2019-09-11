import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str[]=sc.nextLine().split(" ");
        ArrayList<Integer> n=new ArrayList<>();
        n.add(Integer.parseInt(str[1]));
        n.add(Integer.parseInt(str[0]));
        n.add(Integer.parseInt(str[2]));
        n.add(Integer.parseInt(str[3]));
        int sum=0;
        int min=Collections.min(n.subList(1,n.size()));
        sum=sum+(256*min);
        n.set(1,n.get(1)-min);
        n.set(2,n.get(2)-min);
        n.set(3,n.get(3)-min);
        int min2=Collections.min(n.subList(0,2));
        sum=sum+(min2*32);
        System.out.println(sum);







    }
}