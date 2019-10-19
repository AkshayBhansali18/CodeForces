import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionD
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a;
        a=(String.valueOf(Integer.parseInt(br.readLine())));
        String b;
        b=(String.valueOf(Integer.parseInt(br.readLine())));
        int sum;
        sum=Integer.parseInt(a)+Integer.parseInt(b);
        String c=String.valueOf(sum);
       String s1=a.replaceAll("0","");
       String s2=b.replaceAll("0","");
       String s3=c.replaceAll("0","");
       int a1=Integer.parseInt(s1);
        int b1=Integer.parseInt(s2);
        int c1=Integer.parseInt(s3);
        if(a1+b1==c1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}