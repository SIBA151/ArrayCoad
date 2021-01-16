package ArrayLearn;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimnArrUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows and Cols Size");
		int rsize=sc.nextInt();
		int csize=sc.nextInt();
		
		int[][] arr=new int[rsize][csize];
//		System.out.println(Arrays.toString(arr[0]));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the element at position- ["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
				System.out.println(arr[i][j]);
			}
		}
		//to print the elements
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	

	}

}
