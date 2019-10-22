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
        int k=1;
        int index=0;
        int count=0;
        while(index<list.size())
        {
            if(list.get(index)<k)
            index+=1;
            else
            {
                count+=1;
                k=k+1;
                index+=1;
            }
        }
        System.out.println(count);
        }
    }
