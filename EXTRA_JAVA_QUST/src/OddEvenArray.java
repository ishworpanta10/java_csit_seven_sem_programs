
public class OddEvenArray {

	static int[] array = {2, 7, 2, 3, 1};

	public static void main(String []args) {
		System.out.println(isBalanced(array));

	}

	public static int isBalanced(int[] a) {
		int count = 1;
		
		for(int i = 0; i<a.length ; i+=2) {
			if(a[i] % 2 != 0) {
				 count =0;
				break;
			}
		}
		
		for (int j = 1 ; j <a.length ; j+=2) {
			if(a[j] % 2 == 0) {
				 count = 0;
				break;
			}
		}
		
		return count;

	}
}
