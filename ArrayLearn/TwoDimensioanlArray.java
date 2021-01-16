package ArrayLearn;

import java.util.Arrays;

public class TwoDimensioanlArray {

	public static void main(String[] args) {
		int[] arr=new int[] {100,11,23,3};
		
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		
		int evenCount=0;
		int oddCount=0;
		
		System.out.println(Arrays.toString(odd));
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			
			if(val%2==0) {
				even[i]=val;
				evenCount++;
			}else {
				odd[i]=val;
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

	}

}
