package exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class FibonacciNumber {
    public int solution(int n) {
		Deque<Integer> d=new ArrayDeque<Integer>();
		d.add(0);
		d.add(1);
		for(int i=2;i<=n;i++) {
			d.add((d.getFirst()+d.getLast())%1234567);
			d.pollFirst();
		}
        return d.peekLast()%1234567;
    }
}
