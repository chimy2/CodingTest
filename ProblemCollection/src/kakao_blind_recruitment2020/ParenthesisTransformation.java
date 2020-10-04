package blind_recruitment;

public class ParenthesisTransformation {
    public String solution(String p) {
    	/*
1. �Է��� �� ���ڿ��� ���, �� ���ڿ��� ��ȯ�մϴ�. 
2. ���ڿ� w�� �� "�������� ��ȣ ���ڿ�" u, v�� �и��մϴ�. ��, u�� "�������� ��ȣ ���ڿ�"�� �� �̻� �и��� �� ����� �ϸ�, v�� �� ���ڿ��� �� �� �ֽ��ϴ�. 
3. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�" �̶�� ���ڿ� v�� ���� 1�ܰ���� �ٽ� �����մϴ�. 
  3-1. ������ ��� ���ڿ��� u�� �̾� ���� �� ��ȯ�մϴ�. 
4. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶�� �Ʒ� ������ �����մϴ�. 
  4-1. �� ���ڿ��� ù ��° ���ڷ� '('�� ���Դϴ�. 
  4-2. ���ڿ� v�� ���� 1�ܰ���� ��������� ������ ��� ���ڿ��� �̾� ���Դϴ�. 
  4-3. ')'�� �ٽ� ���Դϴ�. 
  4-4. u�� ù ��°�� ������ ���ڸ� �����ϰ�, ������ ���ڿ��� ��ȣ ������ ����� �ڿ� ���Դϴ�. 
  4-5. ������ ���ڿ��� ��ȯ
		 */
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
	                //System.out.println("num="+num+"");
	                if(v.charAt(i) == '(') num++; 
	                else num--;
	                if(num==-1){
	                    check=false;
	                    before=0;
	                }else if(num==1&&check==false) {
	                    check=true;
	                    before=i;
	                }if(num==0 && check==true){
	                	System.out.println(before);
	                	System.out.println(i);
	                    if(before==0) {
		                    u=v.substring(before,i+1);
	                    	System.out.println("1�ܰ�");
	                    	v=v.substring(i+1);
	                    }else if(i!=v.length()) {
	                    	System.out.println("2�ܰ�");
	                    	u="(";
	                    	for(int j=1;j<before-1;j++) {
	                    		u+=(v.charAt(j)=='(')?')':'(';
	                    	}
	                    	u+=')'+v.substring(before,i+1);
	                    	v=v.substring(i+1,v.length());
//    		                    	v=v.substring(0,before)+v.substring(i+1);
//    		                    }else{
//    		                    	System.out.println("3�ܰ�");
//    		                    	v=v.substring(0,before);
	                    }
	                    break;
	                }if(i==v.length()-1) {
	                	System.out.println("4�ܰ�");
	                	u="(";
	                	for(int j=1;j<v.length()-1;j++){
	                		u+=(v.charAt(j)=='(')?')':'(';
	                	}
	                	u+=")";
	                	v="";
	                }
	            }
	            answer+=u;
	            System.out.println("v="+v+", u="+u+", answer="+answer);
        	}
        }
        System.out.println(v.substring(0));
        System.out.println("v="+v+", u="+u);
        System.out.println("answer="+answer);
        return answer;
    }
}
