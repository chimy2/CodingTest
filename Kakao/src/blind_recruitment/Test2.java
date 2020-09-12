package blind_recruitment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
	int[] answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info={"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query= {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[] answer=new int[query.length];
		StringBuffer em=new StringBuffer();
	
		for(int i=0;i<query.length;i++) {
			query[i]=query[i].replaceAll(" and ", " ");
		}

		for(int i=0;i<query.length;i++) {
			for(int j=0;j<info.length;j++) {
				if(query[i].split(" ")[0].equals("-")||query[i].split(" ")[0].equals(info[j].split(" ")[0])) {
					if(query[i].split(" ")[1].equals("-")||query[i].split(" ")[1].equals(info[j].split(" ")[1])) {
						if(query[i].split(" ")[2].equals("-")||query[i].split(" ")[2].equals(info[j].split(" ")[2]))
							if(query[i].split(" ")[3].equals("-")||query[i].split(" ")[3].equals(info[j].split(" ")[3]))
								if(Integer.parseInt(query[i].split(" ")[4])<=Integer.parseInt(info[j].split(" ")[4]))
								answer[i]++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
