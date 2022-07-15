package introduction_coding_tests;

public class MorseCode1 {
//	모스부호 (1)
	public String solution(String letter) {
		String answer = "";
		String s = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',\r\n"
				+ "    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',\r\n"
				+ "    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',\r\n"
				+ "    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',\r\n" + "    '-.--':'y','--..':'z'";
		s = s.replaceAll("['| |\\r\\n|a-z|:]", "");
		String[] arr = s.split(",");
		for (String i : letter.split(" ")) {
			for (int j = 0; j < s.length(); j++) {
				if (i.equals(arr[j])) {
					answer += Character.toString(j + 97);
					break;
				}
			}
		}
		return answer;
	}
}