import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Collections;
 
public class Stabilise
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        int min=list.get(0);
        int max=list.get(list.size()-1);
        int count=0;
        Set<Integer> set=new HashSet<>(list);
        if(set.size()==2&&((max-min)%2!=0))
        count=max-min;
        else
        {
        while(min<max)
        {
            count+=1;
            min=min+1;
            max=max-1;
        }
        }
        
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)+count==min||list.get(i)-count==min||list.get(i)==min)
            {
                
            }
            else
            {
                System.out.println(-1);
                return;
                
            }
        }
        System.out.println(count);
        }
    }