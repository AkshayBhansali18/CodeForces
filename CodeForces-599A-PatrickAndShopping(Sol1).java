import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int d1=0,d2=0,d3=0;
            d1=sc.nextInt();
            d2=sc.nextInt();
            d3=sc.nextInt();
        int dist=0;
        dist=dist+ Math.min(d1,d2);
        int min;
        if(dist==d1)
        {
           min=d1+d3+d2;
           if(d1+d1+d2+d2<min)
               min=d1+d1+d2+d2;
           else if(d1+d3+d3+d1<min)
               min=d1+d3+d3+d1;
           else if(d1+d1+d2+d3+d1<min)
               min=d1+d1+d2+d3+d1;
            System.out.println(min);


        }
        else if(dist==d2)
        {
            min=d2+d3+d1;
            if(d2+d2+d1+d1<min)
                min=d2+d2+d1+d1;
            else if(d2+d3+d3+d2<min)
                min=d2+d3+d3+d2;
            else if(d2+d2+d1+d3+d2<min)
                min=d2+d2+d1+d3+d2;
            System.out.println(min);

        }


    }
}