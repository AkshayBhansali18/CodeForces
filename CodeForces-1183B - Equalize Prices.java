import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Stabilise
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++)
        {
            String str[]=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<str1.length;i++)
            {
                list.add(Integer.parseInt(str1[i]));
            }
            int min=Collections.min(list)+k;
            if(Math.abs(Collections.max(list)-min)>k)
                System.out.println(-1);

            else
                System.out.println(min);
        }
    }
}