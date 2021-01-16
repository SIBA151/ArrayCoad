package ArrayLearn;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		int[] arr= new int[5];
		
		System.out.println(arr);
		
		System.out.println(arr[3]);
		
		arr[0]=100;
		
		System.out.println(arr[0]);
		
		System.out.println(Arrays.toString(arr));
	}

}
