package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2438 {
    public static void main(String[] args) throws Exception {
        BufferedReader sb=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(sb.readLine());
        for(int i=1;i<=num;i++){
            System.out.println("*".repeat(i));
        }
    }
}
