import java.util.Scanner;

public class OddEvenArray {

//	static int[] array = { 2, 7, 2, 3, 8, 1, 4, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of integer array element: ");
		int length1 = sc.nextInt();
		int[] array = new int[length1];

		System.out.println("Enter array element integer : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(isBalanced(array));

	}

	public static int isBalanced(int[] a) {
		int count = 1;

		for (int i = 0; i < a.length; i += 2) {
			System.out.println("Array length :" + a.length);
			if (a[i] % 2 != 0) {
				count = 0;
				break;
			}
		}

		for (int j = 1; j < a.length; j += 2) {
			if (a[j] % 2 == 0) {
				count = 0;
				break;
			}
		}

		return count;

	}
}
