import java.util.*;
import java.io.*;
public class olution
{
public static void main(String args[])
{
Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
String str[]=sc.nextLine().split(" ");
double m=Double.parseDouble(str[0]);
double n=Double.parseDouble(str[1]);
double teams[]=new double[(int)n];
double max_val=m-(n-1);
double max=((max_val-1)*(max_val+1-1))/2;
double peeps=m/n;
double count=0;
double j=0;
while(j<n-1)
{
    count=count+1;
    m=m-peeps;
    j=j+1;
}
double last_team=m;
double min=count*((peeps-1)*(peeps+1-1))/2;
min=min+((last_team-1)*(last_team+1-1)/2);
System.out.println(min+" "+max);


}
}

