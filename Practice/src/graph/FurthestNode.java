package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FurthestNode {
	public static void main(String[] args) {
		int n=6;
		int[][] vertex={{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		int[][] arr=new int[n][n];
		boolean[] check=new boolean[n];
		int[] result=new int[n];
		
		for(int i=0;i<vertex.length;i++) {
			arr[vertex[i][0]-1][vertex[i][1]-1]=-1;
			arr[vertex[i][1]-1][vertex[i][0]-1]=-1;
		}
		check[0]=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[0][i]==-1) {
				check[i]=true;
				change(arr, 0, i, 1);
				result[i]=1;
				recursion(arr, check, result, i, 1);
				check[i]=false;
			}
		}
		
		int max=0;
		int count=0;
		for(int i=0;i<result.length;i++) {
			if(result[i]>max) {
				max=result[i];
				count=1;
			} else {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(result));
	}
	
	public static void recursion(int[][] arr, boolean[] check, int[] result, int x, int value) {
		for(int i=0;i<arr.length;i++) {
			if(!check[i] && arr[x][i]!=0) {
				check[i]=true;
				if(arr[x][i]!=-1 && arr[x][i]<=value) {
					recursion(arr, check, result, i, arr[x][i]);
				} else {
					change(arr, x, i, value+1);
					result[i]=result[i]!=0? Math.min(result[i], value+1) : value+1;
					recursion(arr, check, result, i, value+1);
				}
				check[i]=false;
			}
		}
	}

	public static void change(int[][] arr, int x, int y, int value) {
		arr[x][y]=value;
		arr[y][x]=value;
	}
}
