
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Stabilise {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str=s;
        if(s.contains("0"))
        {
            str=s.replaceFirst("0","");
        }
        else
        {
            str=s.replaceFirst("1","");
        }
        System.out.println(str);

    }
}

