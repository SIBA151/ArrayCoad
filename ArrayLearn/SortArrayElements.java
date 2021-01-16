package ArrayLearn;

import java.util.Arrays;

public class SortArrayElements {

	public static void main(String[] args) {
		int[] arr=new int[] {23,454,567,78,68,90,2,460,11};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
