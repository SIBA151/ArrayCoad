package StringConcept;

import java.util.Arrays;

public class StringConcepts {

	public static void main(String[] args) {
		
		String st="Jenkins tool Build Automation Selenium";
//		splitStringData(st);
//		reverseString(st);
		System.out.println(reversOfWord(st));

	}
	public static void splitStringData(String strData) {
		System.out.println();
		String[] stArr=strData.split(" ");
		System.out.println(stArr.length);
		
		System.out.println(Arrays.toString(stArr));
		for(int i=0; i<=stArr.length;i++) {
			
			int count=stArr[i].length();
			
			System.out.println("Length of "+stArr[i]+" = "+count);
		}
	}
	public static void reverseString(String strData) {
		int lastIndex=strData.length()-1;
		for (int i=lastIndex;i>=0;i--) {
			System.out.println(strData.charAt(i));
		}
		
	}
	public static String reversOfWord(String stData) {
		String[] stArr=stData.split(" ");
		String newStr="";
		
		for(int i=0; i<stArr.length;i++) {
			String word=stArr[i];
			
			int lastIndex=word.length()-1;
			for(int j=lastIndex; j>=0; j--) {
				newStr+=word.charAt(j);
			}
			newStr+=" ";
		}
		return newStr;
		
		
	}

}
