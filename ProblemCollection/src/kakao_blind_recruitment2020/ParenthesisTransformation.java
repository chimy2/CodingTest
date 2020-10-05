package kakao_blind_recruitment2020;

public class ParenthesisTransformation {
    public String solution(String p) {
        String answer = "", v = p, u = "";
        int num=0, before=0;
        boolean check=false;
        if(p.isEmpty()){
            answer="";
        }else{
        	while(answer.length()!=p.length()) {
	            check=false;
	            num=0;
	            u="";
	            for(int i=before;i<v.length();i++){
	                if(v.charAt(i) == '(') num++; 
	                else num--;
	                if(num==-1){
	                    check=false;
	                    before=0;
	                }else if(num==1&&check==false) {
	                    check=true;
	                    before=i;
	                }if(num==0 && check==true){
	                    if(before==0) {
		                    u=v.substring(before,i+1);
	                    	v=v.substring(i+1);
	                    }else if(i!=v.length()) {
	                    	u="(";
	                    	for(int j=1;j<before-1;j++) {
	                    		u+=(v.charAt(j)=='(')?')':'(';
	                    	}
	                    	u+=')'+v.substring(before,i+1);
	                    	v=v.substring(i+1,v.length());
//    		                    	v=v.substring(0,before)+v.substring(i+1);
//    		                    }else{
//    		                    	v=v.substring(0,before);
	                    }
	                    break;
	                }if(i==v.length()-1) {
	                	u="(";
	                	for(int j=1;j<v.length()-1;j++){
	                		u+=(v.charAt(j)=='(')?')':'(';
	                	}
	                	u+=")";
	                	v="";
	                }
	            }
	            answer+=u;
        	}
        }
        return answer;
    }
}
