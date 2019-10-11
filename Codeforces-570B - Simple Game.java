import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class SolutionD
{
    public static void main(String[] args) throws IOException {
        int ans=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        int left=m-2;
        int right=n-m-1;
        if (left < right) {
             ans = m + 1;
        } else {
             ans = m - 1;
        }
        if(n==1)
        System.out.println(1);
        else
        System.out.println(ans);
        
   
    }
 
}