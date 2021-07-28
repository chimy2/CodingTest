package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1260 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] setting=br.readLine().split(" ");
		int num1=Integer.parseInt(setting[0]);
		int num2=Integer.parseInt(setting[1]);
		int num3=Integer.parseInt(setting[2]);
		List<List<Integer>> li=new ArrayList<>();
		boolean[] check=new boolean[num1+1];
		for(int i=0;i<=num1;i++) {
			li.add(new ArrayList<Integer>());
		}
		for(int i=0;i<num2;i++) {
			String[] arr=br.readLine().split(" ");
			int one=Integer.parseInt(arr[0]);
			int two=Integer.parseInt(arr[1]);
			li.get(one).add(two);
			li.get(two).add(one);
		}
		for(int i=0;i<li.size();i++) {
			Collections.sort(li.get(i));
		}
		dfs(li, check, num3);
		System.out.println();
		bfs(li, check, num3);
	}
	
	public static void dfs(List<List<Integer>> li, boolean[] check, int x) {
		System.out.print(x+" ");
		check[x]=true;
		for(int i=0;i<li.get(x).size();i++) {
			int n=li.get(x).get(i);
			if(!check[n]) {
				dfs(li, check, n);
			}
		}
	}
	
	public static void bfs(List<List<Integer>> li, boolean[] check, int x) {
		Queue<Integer> q=new LinkedList<>();
		q.add(x);
		check[x]=false;
		while(!q.isEmpty()) {
			int i=q.poll();
			System.out.print(i+" ");
			for(int j=0;j<li.get(i).size();j++) {
				int k=li.get(i).get(j);
				if(check[k]) {
					q.add(k);
					check[k]=false;
				}
			}
		}
	}
}
