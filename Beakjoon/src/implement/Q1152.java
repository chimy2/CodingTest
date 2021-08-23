package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().trim();
        System.out.println(s.length()==0?0:s.split(" ").length);
    }
}
