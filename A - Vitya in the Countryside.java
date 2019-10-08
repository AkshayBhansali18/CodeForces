import java.util.*;
import java.io.*;
public class Solution {
    static int c = 0;
    int i=0;
    int j=0;
 
    public static void main(String args[]) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
         int last=Integer.parseInt(str[n-1]);
        if(last==15)
        {
        System.out.println("DOWN");
        return;
        }
        else if(last==0)
        {
            System.out.println("UP");
            return;
        }
        if(n==1)
            {
            System.out.println(-1);
            return;
            }
        else
        {
                     int sec_last=Integer.parseInt(str[n-2]);
 
           
            
             if(last>sec_last)
            {
                System.out.println("UP");
                return;
            }
            else if(last<sec_last)
            {
                System.out.println("DOWN");
                return;
            }
        }
       
        
    }
}