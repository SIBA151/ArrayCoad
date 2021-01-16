package ArrayLearn;

import java.util.Arrays;

public class RightShift {

	public static void main(String[] args) {
		int[] arr=new int[] {12,25,55,56,66,255};
		
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++) {
			temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
