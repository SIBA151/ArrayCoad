package ArrayLearn;

public class TikriPartten {

	public static void main(String[] args) {
		int n=9;
		int h=(n+1)/2;
		int e=0;
		int f=0;
		for(int i=1;i<=n; i++) {
			if(i<=h) {
				e=h+i-1;
				f=h-i+1;	
			}else {
				e--;
				f++;
			}
			for(int j=1; j<=n; j++) {
				
				if(e==j||f==j) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
		  System.out.println();
		}

	}

}
