package ArrayLearn;

public class LargestElmn {

	public static void main(String[] args) {
		int[] arr=new int[] {25,565,96,67,85,258};
		
		int max=0;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println("Largest Element "+max);
		System.out.println("Index of Largest Element "+index);

	}

}
