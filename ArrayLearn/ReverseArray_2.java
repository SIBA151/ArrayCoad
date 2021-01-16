package ArrayLearn;

import java.util.Arrays;

public class ReverseArray_2 {

	public static void main(String[] args) {
		int[] arr=new int[] {11,22,33,44,55};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length/2;i++) {
			int lastIndex=arr.length-1;
			int temp=arr[i];
			arr[i]=arr[lastIndex-i];
			arr[lastIndex-i]=temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
