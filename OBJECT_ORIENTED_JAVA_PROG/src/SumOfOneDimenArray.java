
public class SumOfOneDimenArray {


	public static void main(String[] args) {
		 int [] array = {1, 2,3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("The sum of one dimensional array is "+ sumOfArray(array));

	}
	
	public static int sumOfArray( int[] arr) {
		int sum = 0;
		
		for(int i = 0; i< arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

}
