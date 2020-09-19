package exercise;

public class SortByString {
	public String[] solution(String[] strings, int n) {
        String temp="";
		for(int i=0;i<strings.length;i++) {
			for(int j=i;j<strings.length;j++) {
				if(strings[i].charAt(n)>strings[j].charAt(n)) {
					temp=strings[j];
					strings[j]=strings[i];
					strings[i]=temp;
				}if(strings[i].charAt(n)==strings[j].charAt(n)) {
					if(strings[i].compareTo(strings[j])>0) {
						temp=strings[j];
						strings[j]=strings[i];
						strings[i]=temp;
					}
				}
			}
		}
        return strings;
    }
}
