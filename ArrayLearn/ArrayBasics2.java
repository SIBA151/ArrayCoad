package ArrayLearn;

public class ArrayBasics2 {

	public static void main(String[] args) {
		int size =5;
		
		int[] arr =new int[size];
		int n=arr.length;
		
		arr[1]=89;
		arr[4]=45;
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
