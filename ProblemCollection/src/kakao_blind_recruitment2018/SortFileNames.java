package kakao_blind_recruitment2018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortFileNames {
	static Pattern p1=Pattern.compile("\\D+");
	static Pattern p2=Pattern.compile("\\d{1,5}");
    
    public String[] solution2(String[] files) {
        String[] temp=new String[files.length];
		mergeSort(files, temp, 0, files.length-1);
        return files;
    }
    
	public static void mergeSort(String[] files, String[] temp, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(files, temp, start, mid);
			mergeSort(files, temp, mid+1, end);
			
			int p=start;
			int q=mid+1;
			int idx=p;
			Matcher m1, m2, m3, m4;
	
			while(p<=mid || q<=end) {
				if(q>end) {
					temp[idx++]=files[p++];
					continue;
				}
				m1=p1.matcher(files[p].toLowerCase());
				m2=p1.matcher(files[q].toLowerCase());
				m3=p2.matcher(files[p]);
				m4=p2.matcher(files[q]);
	
				if(m1.find() && m2.find() && m3.find() && m4.find()) {
					int num1=Integer.parseInt(m3.group());
					int num2=Integer.parseInt(m4.group());
					if(p<=mid && (m1.group().compareTo(m2.group())<0 
							|| m1.group().compareTo(m2.group())==0 && num1<=num2)) {
						temp[idx++]=files[p++];
					} else {
						temp[idx++]=files[q++];
					}
				}
			}
			for(int i=start;i<=end;i++) {
				files[i]=temp[i];
			}
		}
	}
	
//	55.0 / 100.0
    public String[] solution(String[] files) {
        Pattern p1=Pattern.compile("\\D+");
		Pattern p2=Pattern.compile("\\d{1,5}");
		Arrays.sort(files, new Comparator<String>() {
			Matcher m1, m2;
			@Override
			public int compare(String o1, String o2) {
				m1=p1.matcher(o1.toLowerCase());
				m2=p1.matcher(o2.toLowerCase());
				if(m1.find() && m2.find()) {
					if(m1.group().compareTo(m2.group())!=0) {
						return m1.group().compareTo(m2.group());
					}
					m1=p2.matcher(o1);
					m2=p2.matcher(o2);
					if(m1.find() && m2.find()) {
						int num1=Integer.parseInt(m1.group());
						int num2=Integer.parseInt(m2.group());
						if(num1-num2!=0) {
							return num1-num2;
						}
					}
				}
				return 1;
			}
		});
        return files;
    }
}
