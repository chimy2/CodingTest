package exercise;

public class MiddleCharacterImport {
    public String solution(String s) {
        return s.substring(s.length()%2==0?s.length()/2-1:s.length()/2,s.length()/2+1);
    }
}
