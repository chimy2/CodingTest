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
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands={{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		int[] temp= {};
		int[] answer=new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			temp=Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i]=temp[commands[i][2]-1];
		}
	}
}
