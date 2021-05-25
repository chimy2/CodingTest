package kakao_blind_recruitment2018;

public class DartGame {
    public int solution(String dartResult) {
        int[] answer = new int[3];
        int index=-1;
        for(int i=0;i<dartResult.length();i++){
            char c=dartResult.charAt(i);
            switch(c) {
                case 'S' :
                    break;
                case 'D' :
                    answer[index]=(int)Math.pow(answer[index], 2);
                    break;
                case 'T' :
                    answer[index]=(int)Math.pow(answer[index], 3);
                    break;
                case '*' :
                    if(index>0) {
                        answer[index-1]*=2;
                    }
                    answer[index]*=2;
                    break;
                case '#' :
                    answer[index]*=-1;
                    break;
                default :
                    index++;
                    if(dartResult.charAt(i+1)=='0') {
                        i++;
                        answer[index]=10;
                    } else {
                        answer[index]=Character.getNumericValue(c);
                    }
            }
        }
        return answer[0]+answer[1]+answer[2];
    }
}
