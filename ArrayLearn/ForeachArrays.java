package ArrayLearn;

import java.util.Arrays;
import java.util.Scanner;

public class ForeachArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sc.nextInt();
		int[] marks=new int[size];
		
		//System.out.println(Arrays.toString(marks));
		
		//way 1
		for(int i=0;i<marks.length;i++) {
			marks[i]=(i+1)*10;
		}
		System.out.println(Arrays.toString(marks));
		
		//way 2
//		for(int m:marks) {
//			System.out.println(m);
//		}

	}

}
