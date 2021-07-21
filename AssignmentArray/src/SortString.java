import java.util.Arrays;

public class SortString {

	private String value;

	public SortString(String input) {
		// TODO Constructor
		this.value = input;
	}

	public String sortStrings() {
		// TODO Sort String - Left part Upper-case Right part Lower-case

		String str1 = "";
		char[] ch = value.toCharArray();
		Arrays.sort(ch);
		int len =  ch.length;
		int count = 0;
		
		if(len%2==0) {
			char[] uppr = new char[len/2];
			char[] lowr = new char[len/2];			
			for(int i = 0; i<len/2; i++) {
				uppr[i] = Character.toUpperCase(ch[i]);
				str1 = str1 + uppr[i];
				count++;
			}
			for(int i=count; i<len; i++) {
				lowr[i-count] = Character.toLowerCase(ch[i]);
				str1 = str1 + lowr[i-count];
			}
			
		}
		
		else {
			int len1 = (len/2)+1;
			int len2 = len - len1;
			char[] uppr = new char[len1];
			char[] lowr = new char[len2];
			for(int i = 0; i<len1; i++) {
				uppr[i] = Character.toUpperCase(ch[i]);
				str1 = str1 + uppr[i];
				count++;
			}
			for(int i=count; i<len; i++) {
				lowr[i-count] = Character.toLowerCase(ch[i]);
				str1 = str1 + lowr[i-count];
			}
		}
		return str1;
	}

}
