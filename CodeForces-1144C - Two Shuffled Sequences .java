import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            if(map.containsKey(Integer.parseInt(str[i])))
            {
                map.put(Integer.parseInt(str[i]),map.get(Integer.parseInt(str[i]))+1);
                list2.add(Integer.parseInt(str[i]));
            }
            else
            {
                map.put(Integer.parseInt(str[i]),1);
                list1.add(Integer.parseInt(str[i]));
            }
        }
        for(Map.Entry element : map.entrySet())
        {
            if((int)element.getValue()>2)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.size());
        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        System.out.println(list2.size());
        if(list2.size()==0)
        System.out.println();
        for(int i=list2.size()-1;i>=0;i--)
        {
            System.out.print(list2.get(i)+" ");
        }
 
 
 
    }
}