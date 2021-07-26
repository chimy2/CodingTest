package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q1260 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] setting=br.readLine().split(" ");
		int num1=Integer.parseInt(setting[0]);
		int num2=Integer.parseInt(setting[1]);
		int num3=Integer.parseInt(setting[2]);
		List<List<Integer>> li=new ArrayList<>();
		boolean[] check=new boolean[num1];
		for(int i=0;i<num1;i++) {
			li.add(new ArrayList<Integer>());
		}
		for(int i=0;i<num2;i++) {
			String[] arr=br.readLine().split(" ");
			int one=Integer.parseInt(arr[0]);
			int two=Integer.parseInt(arr[1]);
			li.get(one-1).add(two-1);
			li.get(two-1).add(one-1);
		}
		for(int i=0;i<li.size();i++) {
			Collections.sort(li.get(i));
		}
		check[num3-1]=true;
		System.out.println(li);
		System.out.print(num3);
		dfs(li, check, num3-1);
		System.out.println();
		dfs2(li, check, num3-1);
	}
	
	public static void dfs(List<List<Integer>> li, boolean[] check, int x) {
		for(int i=0;i<li.get(x).size();i++) {
			int n=li.get(x).get(i);
			if(!check[n]) {
				check[n]=true;
				System.out.print(" "+(n+1));
				dfs(li, check, i);
			}
		}
	}
	
	public static void dfs2(List<List<Integer>> li, boolean[] check, int x) {
		check[x]=false;
		System.out.print(x+1+" ");
		for(int i=0;i<li.get(x).size();i++) {
			int y=li.get(x).get(i);
			if(check[y]) dfs2(li, check, y);
		}
	}
}
