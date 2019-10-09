import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Stabilise {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        System.out.println(Math.min(list.get(list.size()-1)-list.get(1),list.get(list.size()-2)-list.get(0)));

    }
}
