package greedy;

import java.io.*;
import java.util.PriorityQueue;

public class Q1715 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int answer=0;
		for(int i=0;i<n;i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<n-1&&n>1;i++) {
			int now=pq.poll()+pq.poll();
			pq.add(now);
			answer+=now;
		}
		System.out.println(answer);
	}	
}
