package StringConcept;

import java.util.Arrays;

public class StringBuiltinMethods {

	public static void main(String[] args) {
		String s1="Test API";
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		char[] arr=s1.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		String[] stArr=s1.split(" ");
		System.out.println(Arrays.toString(stArr));

	}

}
