package kakao_blind_recruitment2021;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RankSearch {
	public static void main(String[] args) {
		String[] info= {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query= {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        
		int[] answer = new int[query.length];
//		Arrays.sort(info);
		List<String> li=List.of(info);
//		System.out.println(li);
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("( )+(and )?");
        	StringBuffer sb=new StringBuffer();
        	for(int j=0;j<q.length;j++) {
        		if(j==q.length-1) {
        			sb.append("(\\d)+");
        			break;
        		}
        		if(q[j].equals("-")) {
        			sb.append("(\\D)+");
        		} else {
        			sb.append("("+q[j]+")");
        		}
        		sb.append("(\\s)");
        	}
        	String pattern=sb.toString();
        	System.out.println("조건="+Arrays.toString(q));
        	System.out.println(pattern);
            for(int j=0;j<li.size();j++){
            	Matcher m=Pattern.compile(pattern).matcher(li.get(j));
            	if(m.find()) {
            		System.out.println(m.group());
            		Matcher m2=Pattern.compile("[\\d]+$").matcher(m.group());
            		if(m2.find() &&
            			Integer.parseInt(m2.group())>=Integer.parseInt(q[q.length-1])) {
            			answer[i]++;
            		}
            	}
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(answer));
	}

//	40.0 / 100.0
    public int[] solution4(String[] info, String[] query) {
        int[] answer = new int[query.length];
		List<String> li=List.of(info);
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("( )+(and )?");
        	StringBuffer sb=new StringBuffer();
        	for(int j=0;j<q.length;j++) {
        		if(j==q.length-1) {
        			sb.append("(\\d)+");
        			break;
        		}
        		if(q[j].equals("-")) {
        			sb.append("(\\D)+");
        		} else {
        			sb.append("("+q[j]+")");
        		}
        		sb.append("(\\s)");
        	}
        	String pattern=sb.toString();
            for(int j=0;j<li.size();j++){
            	Matcher m=Pattern.compile(pattern).matcher(li.get(j));
            	if(m.find()) {
            		Matcher m2=Pattern.compile("[\\d]+$").matcher(m.group());
            		if(m2.find() &&
            			Integer.parseInt(m2.group())>=Integer.parseInt(q[q.length-1])) {
            			answer[i]++;
            		}
            	}
            }
        }
        return answer;
    }

//	40.0 / 100.0
    public int[] solution3(String[] info, String[] query) {
        int[] answer = new int[query.length];
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("( )+(and )?");
        	StringBuffer sb=new StringBuffer();
        	for(int j=0;j<q.length;j++) {
        		if(j==q.length-1) {
        			sb.append("(\\d)+");
        			break;
        		}
        		if(q[j].equals("-")) {
        			sb.append("(\\D)+");
        		} else {
        			sb.append("("+q[j]+")");
        		}
        		sb.append("(\\s)");
        	}
        	String pattern=sb.toString();
            for(int j=0;j<info.length;j++){
            	Matcher m=Pattern.compile(pattern).matcher(info[j]);
            	if(m.find()) {
            		Matcher m2=Pattern.compile("[\\d]+$").matcher(m.group());
            		if(m2.find() &&
            			Integer.parseInt(m2.group())>=Integer.parseInt(q[q.length-1])) {
            			answer[i]++;
            		}
            	}
            }
        }
        return answer;
    }
	
//	40.0 / 100.0
    public int[] solution2(String[] info, String[] query) {
        int[] answer = new int[query.length];
		Arrays.sort(info);
		List<String> li=List.of(info);
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("( )+(and )?");
            for(int j=0;j<li.size();j++){
            	boolean count=true;
            	for(int k=0;k<q.length;k++) {
            		if(q[k].charAt(0)=='-') continue;
            		if(k==q.length-1) {
            			Matcher m=Pattern.compile("[0-9]+").matcher(li.get(j));
            			if(m.find()) {
            				if(Integer.parseInt(m.group())<Integer.parseInt(q[k])) count=false;
            			}
            		} else {
            			if(!li.get(j).contains(q[k])) count=false;
            		}
            	}
            	if(count) {
            		answer[i]++;
            	}
            }
        }
        return answer;
    }
	
//	40.0 / 100.0
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        for(int i=0;i<query.length;i++) {
            String[] q=query[i].split("( )+(and )?");
            for(int j=0;j<info.length;j++){
                String[] p=info[j].split(" ");
                boolean check=true;
                for(int k=0;k<p.length && check;k++) {
                    if(q[k].equals("-")) continue;
                    else if(k==p.length-1) {
                        if(Integer.parseInt(p[k])<Integer.parseInt(q[k])) check=false;
                    } else if(!p[k].equals(q[k])) check=false;
                }
                if(check) answer[i]++;
            }
        }
        return answer;
    }
}
