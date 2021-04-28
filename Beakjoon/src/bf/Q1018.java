package bf;

import java.io.*;
import java.util.Arrays;

public class Q1018 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] num=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		boolean[][] arr=new boolean[num[0]][num[1]];
		int answer=64;
		for(int i=0;i<arr.length;i++) {
			String[] s=br.readLine().split("");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s[j].equals("B")? true:false;
			}
		}
		for(int i=0;i<(num[0]-7)*(num[1]-7);i++) {
			int x=i/(num[1]-7);
			int y=i%(num[1]-7);
			boolean first=arr[x][y];
			int count=0;
			do {
				for(int j=1;j<64;j++) {
					if(j/8%2==0 && (j%2==0 && arr[x+j/8][y+j%8]!=first || j%2==1 && arr[x+j/8][y+j%8]==first)
					|| j/8%2==1 && (j%2==0 && arr[x+j/8][y+j%8]==first || j%2==1 && arr[x+j/8][y+j%8]!=first)) {
						count++;
					}
				}
				if(count<answer) answer=count;
				first=!first;
				count=1;
			} while(first!=arr[x][y]);
		}
		System.out.println(answer);
	}
}
