package StringConcept;

public class StringReverse {

	public static void main(String[] args) {
		String st="Selenium";
		int lastindex=st.length()-1;
		
		for(int i=lastindex;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		

	}

}
