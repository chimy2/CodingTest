package exercise;

public class StringHandlingBasic {
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6){
            for(char a:s.toCharArray()){
                if(a<48||a>57){
                    answer=false;
                    break;
                }
            }
        }else answer=false;
        return answer;
    }
}
