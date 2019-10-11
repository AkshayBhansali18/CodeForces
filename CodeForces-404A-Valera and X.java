import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String a[][]=new String[n][n];
        for(int k=0;k<n;k++)
        {
            String str=br.readLine();
            for(int j=0;j<str.length();j++)
            {
                a[k][j]=String.valueOf(str.charAt(j));
            }
        }
            String non_diag=a[0][1];
            String diag=a[0][0];
            int flag=0;
            if(non_diag.equals(diag))
            {
                System.out.println("NO");
                return;
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j||j==n-i-1)
                    {
                        if(!a[i][j].equals(diag))
                        {
                            System.out.println("NO");
                            return;
                        }
                    }
                    else
                        {
                            if(!a[i][j].equals(non_diag))
                            {
                                System.out.println("NO");
                                return;
                            }
                        }
                    }
                    
                }
    
                    System.out.println("YES");
            }
        }
    
    