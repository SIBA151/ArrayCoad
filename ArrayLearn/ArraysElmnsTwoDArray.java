package ArrayLearn;

import java.util.Arrays;

public class ArraysElmnsTwoDArray {

	public static void main(String[] args) {
		int[][] arr=new int[][] {{89,56},{78,89,79,890},{2,3}};
		
//		int mainArrLen=arr.length;
//		int subArrLen=arr[1].length;
//		System.out.println(subArrLen);
//		System.out.println(mainArrLen);
		
		//rows
		for(int i=0;i<arr.length;i++) {
			
			//System.out.println("loop executes-"+arr[i].length+" times");
			for(int j=0;j<arr[i].length;j++) {
			//	System.out.println(Arrays.toString(arr[i]));
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			//System.out.println("===========================");
		}
	}

}
