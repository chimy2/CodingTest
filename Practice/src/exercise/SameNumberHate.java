package exercise;
import java.util.*;

public class SameNumberHate {
    public List solution(int []arr) {
		List<Integer> ls=new ArrayList();
		int num=0;
		ls.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(ls.get(num)!=arr[i]) {
				ls.add(arr[i]);num++;
			}
		}
        return ls;
    }
}
