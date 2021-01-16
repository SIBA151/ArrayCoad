package StringConcept;

public class ReplaceWithStars {

	public static void main(String[] args) {
	   String str= "Automation is an open source tool";
	   String expected="an";
	   String[] strArr=str.split(" ");
	   String newStr="";
	   for(int i=0;i<strArr.length;i++) {
		   String actual=strArr[i];
		   
		   if(actual.equals(expected)) {
			   int stSize=actual.length();
			   for(int j=0;j<stSize;j++) {
				   newStr+="*";		   
			   }
		   }else {
			   newStr+=actual;
		   }
		   newStr+=" ";
	   }
	   System.out.println(newStr);

	}

}
