import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> rooms=new ArrayList<>();
        String str=br.readLine();
        int j=0;
        for(int i=0;i<10;i++)
        {
            rooms.add(0);
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='L')
            {
                j=0;
                while(rooms.get(j)==1)
                {
                    j+=1;
                }
                rooms.set(j,1);
            }
            else if(str.charAt(i)=='R')
            {
                j=rooms.size()-1;
                while(rooms.get(j)==1)
                {
                    j=j-1;
                }
                rooms.set(j,1);
            }
            else
            {
                rooms.set(Integer.parseInt(String.valueOf((str.charAt(i)))),0);
            }
        }
        for(int i=0;i<rooms.size();i++)
        {
            System.out.print(rooms.get(i));
        }
    }
}
