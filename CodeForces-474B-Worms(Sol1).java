import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        long sum=0;
        long cumsum[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
            cumsum[i]=sum;

        }
        int k=sc.nextInt();
        int num[]=new int[k];
        int val[]=new int[(int)k];
        int j=0;
        for(int i=0;i<k;i++)
        {
            num[i]=sc.nextInt();
            for (int l = 0; l < cumsum.length - 1; l++) {
                if (num[i] > cumsum[l] && num[i] <= cumsum[l + 1]) {
                    val[i] = l + 2;
                    break;
                }
                else if (num[i] < cumsum[0]) {
                    val[i] = 1;
                    break;
                }

        }

        }
        for(int i=0;i<k;i++)
        {
            System.out.println(val[i]);
        }



    }
}