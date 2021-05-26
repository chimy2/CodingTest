package exercise;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {
	//네 번째 시도 100.0 / 100.0
    public int solution4(int n) {
        int answer = 0;
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<arr.length;i++) {
            if(!arr[i]) {
                answer++;
                for(int j=(int)Math.pow(i, 2);j<=n;j+=i) {
                    arr[j]=true;
                }
            }
        }
        return answer;
    }
	
	//세 번째 시도 75.0 / 100.0
    public int solution3(int n) {
        int answer = 0;
		List<Boolean> ls = new ArrayList<Boolean>();
		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1)
				ls.add(false);
			else
				ls.add(true);
		}
		for (int i = 2; (i * i) <= n; i++) {
			if(ls.get(i)){
				for(int j = i*i; j<=n; j+=i) ls.set(j, false);
			}
		}
		for (int i = 0; i <= n; i++) {
			if (ls.get(i))
				answer++;
		}
        return answer;
    }
	//두 번째 시도 75.0 / 100.0
    public int solution2(int n) {
        List<Integer> ls=new ArrayList<Integer>();
        if(n>=2)ls.add(2);
        for(int i=3;i<=n;i++) {
            for(int j=0;j<ls.size();j++) {
                if(i%ls.get(j)==0)break;
                else if(j+1>=ls.size()) {
                    ls.add(i);
                    break;
                }
            }
        }
        return ls.size();
    }
    
	//첫 번째 시도 75.0 / 100.0
    public int solution(int n) {
        int answer=0;
        List<Integer> ls=new ArrayList<Integer>();
        int index=0;
        for(int i=2;i<=n;i++) {
            index=0;
            do {
                if(ls.isEmpty()) {
                    ls.add(i);
                    answer++;
                    break;
                }else if(i%ls.get(index)==0)break;
                else if(index+1>=ls.size()) {
                    ls.add(i);
                    answer++;
                    break;
                }
                index++;
            }while(index<ls.size());
        }
        return answer;
    }
}
