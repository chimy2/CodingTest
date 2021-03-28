package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<num;i++) {
			li.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(li);
		for(int i:li) {
			bw.write(String.valueOf(i)+"\n");
		}
		bw.flush();
	}

}
