import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String ip=sc.nextLine();
        int n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            int start=sc.nextInt();
            int end=sc.nextInt();
            String part=ip.substring(start-1,end);
            for(int i=0;i<part.length()-1;i++)
            {
                if(part.charAt(i)==part.charAt(i+1))
                    count+=1;
            }
            System.out.println(count);
            count=0;

        }

    }
}