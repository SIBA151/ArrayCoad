package StringConcept;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String st1="Silent";
		String st2="Listen";
		
		boolean flag = false;
		
		int lenSt1 =st1.length();
		int lenSt2 =st2.length();
		
		
		if(lenSt1 == lenSt2) {
			st1=st1.toLowerCase();
			st2=st2.toLowerCase();
			
			char[] chArr1 = st1.toCharArray();
			char[] chArr2 = st2.toCharArray();
			
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			
			for(int i=0;i<chArr1.length;i++) {
				if(chArr1[i]!=chArr2[i]) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println("not an Anagram");
			}else {
				System.out.println("yes Anagram");
			}
		}else {
			System.out.println("length of string should be same!");
		}

	}

}
