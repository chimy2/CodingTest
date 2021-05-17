package kakao_blind_recruitment2021;

public class RecommendNewID {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();
        new_id=new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id=new_id.replaceAll("\\.{2,}", ".");
        new_id=new_id.replaceAll("^\\.", "");
        new_id=new_id.replaceAll("\\.$", "");
        
        int len=new_id.length();
        if(len==0) new_id+="a";
        if(len>=16) {
            new_id=new_id.substring(0, 15);
            new_id=new_id.replaceAll("\\.$", "");
        } else if(len<=2) {
            while(new_id.length()<3) {
                new_id+=new_id.charAt(new_id.length()-1);
            }
        }
        System.out.println(new_id);
        return new_id;
    }
}
