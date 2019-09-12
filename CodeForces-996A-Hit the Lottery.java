import java.util.*;
import java.io.*;
public class olution
{
public static void main(String args[])
{
Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
int n=Integer.parseInt(sc.nextLine());
int arr[]=new int[5];
arr[0]=100;
arr[1]=20;
arr[2]=10;
arr[3]=5;
arr[4]=1;
int sum=0;
int j=0;
while(true)
{
if(n/arr[j]==0)
{
j=j+1;
}
else
{
int val=n/arr[j];
n=n-((val)*arr[j]);
sum+=(val);
if(n==0)
break;
}
}
System.out.println(sum);
}
}


