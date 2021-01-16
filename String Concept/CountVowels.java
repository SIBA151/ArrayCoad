package StringConcept;

public class CountVowels {

	public static void main(String[] args) {
		String st="RestAssurd";
		st=st.toLowerCase();
		int count_vowel=0;
		int count_const=0;
		System.out.println(st);
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='a' || st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				count_vowel++;
			}else {
				count_const++;
			}
		}
		System.out.println("Vowels Count- "+count_vowel);
		System.out.println("Consonants Count - "+count_const);

	}

}
