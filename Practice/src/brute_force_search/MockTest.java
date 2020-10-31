package brute_force_search;

import java.util.*;

public class MockTest {
	//문제를 잘 읽자 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	public int[] solution(int[] answers) {
		int[] two= {1,3,4,5};
		int[] three= {3,1,2,4,5};
		int max=0;
		List<Integer> m=new ArrayList<Integer>();
		List<Integer> l=new ArrayList<Integer>();
		m.add(0);
		m.add(0);
		m.add(0);
		
		for(int i=0;i<answers.length;i++) {
			int num=answers[i];
			if(num==i%5+1) {
				m.set(0, m.get(0)+1);
			}
			if(i%2==0&&num==2) {
				m.set(1, m.get(1)+1);
			}else if(i%2==1&&num==two[i/2%4]) {
				m.set(1, m.get(1)+1);
			}
			if(num==three[i/2%5]) {
				m.set(2, m.get(2)+1);
			}
		}
		max=Collections.max(m);
		for(int i=0;i<m.size();i++) {
			if(max==m.get(i)) {
				l.add(i+1);
			}
		}
        return l.stream().mapToInt(i->i).toArray();
    }

    public int[] solution5(int[] answers) {
		int[] one= {1, 2, 3, 4, 5};
		int[] two= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		List<Integer> m=new ArrayList<Integer>();
		Stack<Integer> l=new Stack<Integer>();
		m.add(0);
		m.add(0);
		m.add(0);
		
		for(int i=0;i<answers.length;i++) {
			int num=answers[i];
			if(num==one[i%one.length]) {
				m.set(0, m.get(0)+1);
			}
			if(num==two[i%two.length]) {
				m.set(1, m.get(1)+1);
			}
			if(num==three[i%three.length]) {
				m.set(2, m.get(2)+1);
			}
		}

		l.addAll(m);
		Collections.sort(l);
		Collections.reverse(l);
		for(int i=0;i<l.size();i++) {
			if(l.get(i)==0) break;
			for(int j=0;j<m.size();j++) {
				if(l.get(i)==m.get(j)) {
					l.set(i, j+1);
					m.set(j, 0);
					break;
				}
			}
		}
		while(l.peek()==0) {
			l.pop();
		}
        return l.stream().mapToInt(i->i).toArray();
    }

    public int[] solution4(int[] answers) {
		
		int[] two= {1,3,4,5};
		int[] three= {3,1,2,4,5};
		
		List<Integer> m=new ArrayList<Integer>();
		Stack<Integer> l=new Stack<Integer>();
		m.add(0);
		m.add(0);
		m.add(0);
		
		for(int i=0;i<answers.length;i++) {
			int num=answers[i];
			if(num==i%5+1) {
				m.set(0, m.get(0)+1);
			}
			if(i%2==0&&num==2) {
				m.set(1, m.get(1)+1);
			}
			if(i%2==1&&num==two[i/2%4]) {
				m.set(1, m.get(1)+1);
			}
			if(num==three[i/2%5]) {
				m.set(2, m.get(2)+1);
			}
		}

		l.addAll(m);
		Collections.sort(l);
		Collections.reverse(l);
		for(int i=0;i<l.size();i++) {
			if(l.get(i)==0) break;
			for(int j=0;j<m.size();j++) {
				if(l.get(i)==m.get(j)) {
					l.set(i, j+1);
					m.set(j, 0);
					break;
				}
			}
		}
		while(l.peek()==0) {
			l.pop();
		}
        return l.stream().mapToInt(i->i).toArray();
    }
	
    public int[] solution3(int[] answers) {
		//35.7 / 100.0
		int[] two= {1,3,4,5};
		int[] three= {3,1,2,4,5};
		
		List<Integer> l=new ArrayList<Integer>();
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		m.put(1, 0);
		m.put(2, 0);
		m.put(3, 0);
		
		for(int i=0;i<answers.length;i++) {
			int num=answers[i];
			if(num==i%5+1) {
				m.replace(1, m.get(1)+1);
			}
			if(i%2==0&&num==2) {
				m.replace(2, m.get(2)+1);
			}
			if(i%2==1&&num==two[i/2%4]) {
				m.replace(2, m.get(2)+1);
			}
			if(num==three[i/2%5]) {
				m.replace(3, m.get(3)+1);
			}
		}
		
		while(m.get(1)!=0||m.get(2)!=0||m.get(3)!=0) {
			int max=0;
			int max_index=0;
			for(int i=1;i<=m.size();i++) {
				if(max<m.get(i)) {
					max=m.get(i);
					max_index=i;
				}
			}
			l.add(max_index);
			m.replace(max_index, 0);
		}
        return l.stream().mapToInt(i->i).toArray();
    }

    public int[] solution2(int[] answers) {
		//35.7 / 100.0
		int[] answer;
		List<Integer> ls1=List.of(1,3,4,5);
		List<Integer> ls2=List.of(3,1,2,4,5);
		List<Integer> x=Arrays.asList(0,0,0);
		byte sum=0;
		int a=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==i%5+1)x.set(0, x.get(0)+1);
			if(i%2==0) {if(answers[i]==2) x.set(1, x.get(1)+1);}
			else {if(answers[i]==ls1.get((i/2)%4))x.set(1, x.get(1)+1);}
			if(answers[i]==ls2.get(i/2%5))x.set(2, x.get(2)+1);
			if(i%2==0) System.out.printf("i=%d, answers[i]=%d %d=%d , %d=%d, %d=%d\n",i,answers[i],i%5+1,x.get(0),2,x.get(1),ls2.get(i/2%5),x.get(2));
			else System.out.printf("i=%d, answers[i]=%d %d=%d , %d=%d, %d=%d\n",i,answers[i],i%5+1,x.get(0),ls1.get((i/2)%4),x.get(1),ls2.get(i/2%5),x.get(2));
		}
		for(int i:x) if(i!=0) sum++;
		answer=new int[sum];System.out.printf("x=%d, y=%d, z=%d\n",x.get(0).intValue(),x.get(1).intValue(),x.get(2).intValue());
		
		for(int i=0;i<answer.length;i++) {
			a=Math.max(Math.max(x.get(0), x.get(1)), x.get(2));
			answer[i]=x.indexOf(a)+1;
			x.set(x.indexOf(a), -1);
		}
		System.out.printf("x=%d, y=%d, z=%d\n",x.get(0).intValue(),x.get(1).intValue(),x.get(2).intValue());
		System.out.printf(Arrays.toString(answer));
        return x.stream().mapToInt(i->i).toArray();
	}

    public int[] solution1(int[] answers) {
        int[] answer;
		List<Integer> ls1=List.of(1,3,4,5);
		List<Integer> ls2=List.of(3,1,2,4,5);
		List<Integer> x=Arrays.asList(0,0,0);
		byte sum=0;
		int a=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==i%5+1)x.set(0, x.get(0)+1);
			if(i%2==0) {if(answers[i]==2) x.set(1, x.get(1)+1);}
			else {if(answers[i]==ls1.get((i/2)%4))x.set(1, x.get(1)+1);}
			if(answers[i]==ls2.get(i/2%5))x.set(2, x.get(2)+1);
		}
		for(int i:x) if(i!=0) sum++;
		answer=new int[sum];
		for(int i=0;i<answer.length;i++) {
			a=Math.max(Math.max(x.get(0), x.get(1)), x.get(2));
			answer[i]=x.indexOf(a)+1;
			x.set(x.indexOf(a), -1);
		}
        return answer;
    }
}
