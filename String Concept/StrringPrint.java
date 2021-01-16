package StringConcept;

import java.util.Arrays;

public class StrringPrint {

	public static void main(String[] args) {
		
		String str="String";
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		
		//convert string to array
		char[] chArr=str.toCharArray();
		System.out.println(Arrays.toString(chArr));
		
		for(char x:chArr) {
			System.out.println(x);
		}

	}

}
