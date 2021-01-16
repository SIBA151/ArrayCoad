package StringConcept;

import java.util.Arrays;

public class CountWords {

	public static void main(String[] args) {
		String str="Selenium is an automation testing tool";
		//way1
		
//		String[] strArr=str.split(" ");
//		
//		System.out.println(Arrays.toString(strArr));
//		
//		int count=strArr.length;
//		System.out.println("Total Words Count-"+count);
		
		//way2
//		int totalword=1;
//		for(int i=0;i<str.length(); i++) {
//			if(str.charAt(i)==' ') {
//				totalword++;
//			}
//		}
//		System.out.println("Total Words are-"+totalword);
        //way 3
		int count=1;
		char[] chArr=str.toCharArray();
		System.out.println(Arrays.toString(chArr));
		
		for(int j=0;j<chArr.length;j++) {
			if(chArr[j]==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
