package StringConcept;

import java.util.Arrays;

public class StringBuiltinMethods2 {

	public static void main(String[] args) {
		String s1="Test###API";
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		char[] arr=s1.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		String[] strArr=s1.split("###");
		System.out.println(Arrays.toString(strArr));
		
		System.out.println(strArr[1]);
		
		String locator="id##email@@@test@gmail.com";
		
		String[] splitStr=locator.split("##|@@@");
		System.out.println(Arrays.toString(splitStr));
		System.out.println("=======================");
//		String[] stArr=locator.split("##");
//		System.out.println(Arrays.deepToString(stArr));
//		
//		String id=stArr[0];
//		String email_id=stArr[1];
//		String[] idArr=email_id.split("@@@");
//		String emailLoc=idArr[0];
//		String emailId=idArr[1];
//		
//		System.out.println(Arrays.toString(idArr));
//		System.out.println(id+"-"+emailLoc+"-"+emailId);
		
		String str="Automation testing";
//		str=str.concat(" Course");
//		System.out.println(str);
		
		boolean res=str.contains("tom");
		System.out.println(res);

	}

}
