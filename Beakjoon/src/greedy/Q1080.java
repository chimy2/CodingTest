package greedy;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Q1080 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] size=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] arr=new int[size[0]][size[1]];
		int[][] arr2=new int[size[0]][size[1]];
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			String[] s=br.readLine().split("");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(s[j]);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			String[] s=br.readLine().split("");
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=Integer.parseInt(s[j]);
			}
		}
		for(int i=0;i<(size[0]-2)*(size[1]-2)&&size[0]>2&&size[1]>2;i++) {
			int x=i/(size[1]-2);
			int y=i%(size[1]-2);
			if(arr[x][y]!=arr2[x][y]) {
				changeArr(arr, x, y);
				answer++;
			}
		}
		for(int i=0;i<size[0]*size[1];i++) {
			if(arr[i/size[1]][i%size[1]]!=arr2[i/size[1]][i%size[1]]) {
				answer=-1;
				break;
			}
		}
		System.out.println(answer);
	}

	private static void changeArr(int[][] arr, int x, int y) {
		for(int i=0;i<9;i++) {
			arr[x+i/3][y+i%3]=arr[x+i/3][y+i%3]==0?1:0;
		}
	}
}
