package hash;

public class TelephoneNumbersList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
		for(int i=0;i<phone_book.length-1&&answer;i++) {
			for(int j=i+1;j<phone_book.length&&answer;j++) {
				int index=0;
				while(phone_book[i].length()>index&&phone_book[j].length()>index) {
					if(phone_book[i].charAt(index)!=phone_book[j].charAt(index)) {
						break;
					}
					index++;
					if(phone_book[i].length()==index||phone_book[j].length()==index) {
						answer=false;
					}
				}
			}
		}
        return answer;
    }
}
