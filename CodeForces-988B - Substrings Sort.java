import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Stabilise
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Integer> len=new ArrayList<>();
        HashMap<Integer,String> map=new HashMap<>();
        ArrayList<String> list2=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            String s=br.readLine();
            len.add(s.length());
        list.add(s);
        }
        Collections.sort(len);
        for(int i=0;i<len.size();i++)
        {
            int size=len.get(i);
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j).length()==size) {
                    list2.add(list.get(j));
                    list.remove(j);
                }
            }
        }

        for(int i=1;i<list2.size();i++)
        {
            if(list2.get(i).contains(list2.get(i-1)))
            {

            }
            else
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        for(int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }

    }
}