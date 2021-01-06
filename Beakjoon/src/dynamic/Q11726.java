package dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11726 {
//	2×n 타일링
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int input=Integer.parseInt(br.readLine());
		int[] n=new int[input>1?input:2];
		n[0]=1;
		n[1]=2;
		for(int i=2;i<input;i++){
			n[i]=(n[i-2]+n[i-1])%10007;
		}
		bw.write(n[input-1]%10007+"");
		bw.flush();
		bw.close();
	}
}
