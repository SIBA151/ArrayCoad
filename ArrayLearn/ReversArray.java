package ArrayLearn;

import java.util.Arrays;
import java.util.Scanner;

public class ReversArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plase Enter the size of arr");
		int size =sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+ " element");
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========================================");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
