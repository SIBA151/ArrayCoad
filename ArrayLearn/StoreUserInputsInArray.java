package ArrayLearn;

import java.util.Arrays;
import java.util.Scanner;

public class StoreUserInputsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Size of an Array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		//System.out.println(arr);
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" Element of an Array");
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
