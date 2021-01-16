package ArrayLearn;

public class AvgOfArrayElmns {

	public static void main(String[] args) {
		int[] arr=new int[] {12,25,55,56,66,25};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		
		//2way
//		for(int num:arr) {
//			sum+=num;
//		}
		
		System.out.println(sum);
		int avg=sum/arr.length;
		System.out.println(avg);

	}

}
