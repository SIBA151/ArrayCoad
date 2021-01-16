package StringConcept;
import java.util.Arrays;

public class DuplicateWordsInChars {

	public static void main(String[] args) {
		String st="jenkins tool build automation selenium";

		
		char[] arr= st.toCharArray();
		System.out .println(Arrays.toString(arr));
			for(int i=0; i<arr.length; i++) {
				int count=1;
				for(int j=i+1;j<arr.length; j++) {
				    if(arr[i]==arr[j]) {
			    		arr[j]=' ';
		    			count++;
	     			}
				}
			  if(arr[i]!=' ') {
			    	System.out.println(arr[i]+" = "+count);
			  }
			}
		
		

	}

}
