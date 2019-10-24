import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Stabilise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder s = new StringBuilder();
        s.append(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            StringBuilder s2=new StringBuilder();
            s2.append(s.substring(0,index));
            s2.reverse();
            s.replace(0,index,s2.toString());
        }
        System.out.println(s.toString());
    }
}

