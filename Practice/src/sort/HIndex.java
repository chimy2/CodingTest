package sort;

public class HIndex {
    public int solution(int[] citations) {
        int answer=0;
        for(int i=citations.length;i>0;i--) {
            int count=0;
            for(int j=0;j<citations.length;j++) {
                if(i<=citations[j]) count++;
            }
            if(count>=i) {
                answer=i;
                break;
            }
        }
        return answer;
    }
}
