package StringConcept;

public class replace_method_and_trim_method {

	public static void main(String[] args) {
		String st=" this is demo ";
		st=st.trim();
		System.out.println(st);
		
		String st1=st.replace("is", "was");
		System.out.println(st1);
		
		String st2=st.replaceFirst("is", "was");
		System.out.println(st2);

	}

}
