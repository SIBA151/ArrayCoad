package StringConcept;

import java.util.Arrays;

public class DuplicateWords {

	public static void main(String[] args) {
		String st="testing testing tool testing tool";
		
		String[] stArr=st.split(" ");
		
		System.out.println(Arrays.toString(stArr));
		
		for(int i=0; i<stArr.length;i++) {
			int count=1;
			for(int j=i+1; j<stArr.length; j++) {
				if(stArr[i].equals(stArr[j])) {
					count++;
					stArr[j]="#";
				}
			}
			if(stArr[i]!="#")
			System.out.println(stArr[i]+" occor "+count+" times ");
		}

	}

}
