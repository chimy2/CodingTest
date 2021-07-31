package dev_matching_web_backend_developer_firsthalf2021;

import java.util.Arrays;

public class RotatingMatrixBorders {
	public static void main(String[] args) {
//		int rows=6;
//		int columns=6;
//		int[][] queries={{2,2,5,4},{3,3,6,6},{5,1,6,3}, {2,5,3,6}};
//		int rows=3;
//		int columns=3;
//		int[][] queries={{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
//		int rows=100;
//		int columns=97;
//		int[][] queries= {{1,1,100,97}};
//		int rows=8;
//		int columns=5;
//		int[][] queries= {{3,1,6,4}};
		int rows=3;
		int columns=3;
		int[][] queries = {{1,1,2,2},{1,1,2,3}};
		int[][] arr=new int[rows][columns];
		int[] answer=new int[queries.length];
		for(int i=0;i<rows*columns;i++) {
//			System.out.println(i/columns+", "+i%columns);
			arr[i/columns][i%columns]=i+1;
		}
		for(int i=0;i<queries.length;i++) {
			answer[i]=rotate2(arr, queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
			for(int[] a:arr) {
				System.out.println(Arrays.toString(a));
			}
			System.out.println();
		}
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(answer));
	}
	
	public static int rotate2(int[][] arr, int x1, int y1, int x2, int y2) {
		int min=arr[x1][y1];
		int row=x2-x1;
		int column=y2-y1;
		int x=x1-1;
		int y=y1-1;
		int v=arr[x][y];
		int temp=0;
		for(int i=0;i<(row+column)*2;i++) {
			if(i<column) {
				temp=arr[x][y+1];
				arr[x][++y]=v;
			} else if(i<column+row) {
				temp=arr[x+1][y];
				arr[++x][y]=v;
			} else if(i<column*2+row) {
				temp=arr[x][y-1];
				arr[x][--y]=v;
			} else {
				temp=arr[x-1][y];
				arr[--x][y]=v;
			}
			v=temp;
//			System.out.println(x+", "+y+", "+i+", "+v);
			if(v<min) min=v;
//			System.out.println(i);
		}
		return min;
	}
	
//	18.2 / 100.0
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] arr=new int[rows][columns];
		int[] answer=new int[queries.length];
		for(int i=0;i<rows*columns;i++) {
			arr[i/columns][i%columns]=i+1;
		}
		for(int i=0;i<queries.length;i++) {
			answer[i]=rotate(arr, queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
		}
		return answer;
	}
	
	public int rotate(int[][] arr, int x1, int y1, int x2, int y2) {
		int min=arr[x1][y1];
		int row=x2-x1;
		int column=y2-y1;
		int x=x1-1;
		int y=y1-1;
		int v=arr[x][y];
		int temp=0;
		for(int i=0;i<(row+column)*2;i++) {
			if(i<column) {
				temp=arr[x][y+1];
				arr[x][++y]=v;
			} else if(i<column+row) {
				temp=arr[x+1][y];
				arr[++x][y]=v;
			} else if(i<column*2+row) {
				temp=arr[x][y-1];
				arr[x][--y]=v;
			} else {
				temp=arr[x-1][y];
				arr[--x][y]=v;
			}
			v=temp;
			min=Math.min(v, min);
		}
		return min;
	}
}
