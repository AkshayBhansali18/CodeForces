import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            list.add(n);

        }
        int time=0;
            int curr=0;
            for(int i=0;i<list.size();i++){
            if(curr<list.get(i))
            {
                time+=(list.get(i)-curr)+1;
                curr=list.get(i);

            }
            else if(curr>list.get(i))
            {
                time+=curr-list.get(i)+1;
                curr=list.get(i);
            }
            else if(curr==list.get(i))
                time+=1;

        }
        time+=t-1;
        System.out.println(time);
    }
}