package ArrayLearn;

import java.util.Arrays;

public class RightShift2 {

	public static void main(String[] args) {
		int[] arr=new int[] {65,85,66,75,59,99,42};
		
		int lastIndex=arr.length-1;
		
		int temp=arr[lastIndex];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[lastIndex-i]=arr[lastIndex-(1+i)];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));

	}

}
