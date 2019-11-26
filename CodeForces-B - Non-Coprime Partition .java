import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolutionD
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==1|| n==2) {
            System.out.println("No");
            return;
        }
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        System.out.println("Yes");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                even.add(i);
            else
                odd.add(i);
        }
        System.out.print(even.size()+" ");
        for(int i=0;i<even.size();i++)
        {
            System.out.print(even.get(i)+" ");
        }
        System.out.println();
        System.out.print(odd.size()+" ");
        for(int i=0;i<odd.size();i++)
        {
            System.out.print(odd.get(i)+" ");
        }

    }
}