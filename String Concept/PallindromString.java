package StringConcept;

public class PallindromString {

	public static void main(String[] args) {
		String str="ABBA";
		String revStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr +=str.charAt(i);
		}
			if(str.equalsIgnoreCase(revStr)) {
				System.out.println("Pallindrom");
			}else {
				System.out.println("Not a Pallindrom");
			}
		

	}

}
