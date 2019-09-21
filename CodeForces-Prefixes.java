import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        char str[]=br.readLine().toCharArray();
        ArrayList<String> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        int count=0;
        for(int i=0;i<str.length;i=i+1)
        {
            list.add(String.valueOf(str[i]));

        }
        for(int i=2;i<=str.length;i=i+2) {
            list1 = list.subList(i-2,i );
            int j = 0;
            while (j < list1.size()) {
                if (Collections.frequency(list1, "a") == Collections.frequency(list1, "b"))
                    break;

                while (Collections.frequency(list1, "a") > Collections.frequency(list1, "b")) {

                    if (list1.get(j).equals("a")) {
                        list.set(j, "b");
                        list1.set(j, "b");
                        count += 1;
                    }
                    j = j + 1;
                }

                while (Collections.frequency(list1, "a") < Collections.frequency(list1, "b")) {

                    if (list1.get(j).equals("b")) {
                        list.set(j, "a");
                        list1.set(j, "a");

                        count += 1;

                    }
                    j = j + 1;
                }

            }
        }
        System.out.println(count);
        for(int j=0;j<list.size();j++)
            System.out.print(list.get(j));
    }
}