package blind_recruitment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Test2{
	public static boolean[] visited=new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		long a1=System.currentTimeMillis();
		graph.add(0,new ArrayList<Integer>());
		graph.add(1,new ArrayList<Integer>(Arrays.asList(2,3,8)));
		graph.add(2,new ArrayList<Integer>(Arrays.asList(1,7)));
		graph.add(3,new ArrayList<Integer>(Arrays.asList(1,4,5)));
		graph.add(4,new ArrayList<Integer>(Arrays.asList(3,5)));
		graph.add(5,new ArrayList<Integer>(Arrays.asList(3,4)));
		graph.add(6,new ArrayList<Integer>(Arrays.asList(7)));
		graph.add(7,new ArrayList<Integer>(Arrays.asList(2,6,8)));
		graph.add(8,new ArrayList<Integer>(Arrays.asList(1,7)));
		bfs2(1);
		System.out.println((System.currentTimeMillis()-a1)/1000.00);

		long a2=System.currentTimeMillis();
		
		int[][] graph={{},{2,3,8},{1,7},
				{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
		boolean[] visited=new boolean[9];
		bfs1(graph, 1, visited);
		System.out.print((System.currentTimeMillis()-a2)/1000.0);
		
	}
	public static void bfs2(int start) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(start);
		visited[start]=true;
		while(!queue.isEmpty()) {
			int x=queue.poll();
			System.out.print(x+" ");
			for(int i=0;i<graph.get(x).size();i++) {
				int y=graph.get(x).get(i);
				if(!visited[y]) {
					queue.offer(y);
					visited[y]=true;
				}
			}
		}
	}public static void bfs1(int[][] graph, int v,boolean[] visited) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(v);
		visited[v]=true;
		while(queue.peek() != null) {
			v=queue.poll();
			System.out.printf("%d ",v);
			for(int i:graph[v]) {
				if(!visited[i]) {
					queue.add(i);
					visited[i]=true;
				}
			}
		}
	}
}
