package exercise;

public class CorrectParenthesis {
//	올바른 괄호
    boolean solution(String s) {
       boolean answer = true;
       int su = 0;
       for(char i:s.toCharArray()) {
           su += i=='('? 1 : -1;
           if(su<0) {
               answer = false;
               return answer;
           }
       }
       if(su!=0) {
           answer = false;
       }
       return answer;
   }
}
