package kakao_blind_recruitment2021;

import java.util.Arrays;

public class RankSearch {
	public static void main(String[] args) {
		String[] info= {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query= {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        int[] answer = new int[query.length];
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("[ and | ]");
            for(int j=0;j<info.length;j++){
                String[] p=info[j].split(" ");
                boolean check=true;
                System.out.println(Arrays.deepToString(p));
                System.out.println(Arrays.deepToString(q));
                for(int k=0;k<p.length && check;k++) {
                	System.out.println(q[k]+", "+p[k]);
                    if(q[k].equals("-")) continue;
                    else if(k==p.length-1) {
                        if(q[k].compareTo(p[k])<0) check=false;
                    } else if(!p[k].equals(q[k])) check=false;
                }
                System.out.println(check);
                if(check) answer[i]++;
            }
        }
        System.out.println(Arrays.toString(answer));
	}
}
