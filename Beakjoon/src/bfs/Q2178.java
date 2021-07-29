package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2178 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int[][] arr=new int[Integer.parseInt(s[0])][Integer.parseInt(s[1])];
		boolean[][] check=new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			s=br.readLine().split("");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(s[j]);
			}
		}
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println(bfs(arr, check, 0, 0, 1));
	}

	private static int bfs(int[][] arr, boolean[][] check, int i, int j, int n) {
		check[i][j]=true;
		for(boolean[] a: check) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		if(i<arr.length-1 && !check[i+1][j] && arr[i+1][j]==1) {
			n=bfs(arr, check, i+1, j, n+1);
		}
		if(j>1 && !check[i][j-1] && arr[i][j-1]==1) {
			n=bfs(arr, check, i, j-1, n+1);
		}
		if(j<arr[i].length-1 && !check[i][j+1] && arr[i][j+1]==1) {
			n=bfs(arr, check, i, j+1, n+1);
		}
		return n;
	}
}
