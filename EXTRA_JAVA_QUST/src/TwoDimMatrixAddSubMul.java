import java.util.Scanner;

public class TwoDimMatrixAddSubMul {

	public static void main(String[] args) {
		int[][] firstMatrix = new int[3][3];
		int[][] secondMtrix = new int[3][3];
		int[][] result = new int[3][3];

//		Taking first input matrix :
		System.out.println("Enter first 3 * 3 matrix");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}

//		Taking second matrix :
		System.out.println("Enter fisecond matric in 3 * 3 matrix");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				secondMtrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("First Matrix is :");
		displayResult(firstMatrix);

		System.out.println("Second Matrix is :");
		displayResult(secondMtrix);
		
		System.out.println("Sum of two Matrix is :");
		result =  calculateSum(firstMatrix,secondMtrix);
		displayResult(result);
		
		System.out.println("Difference of two Matrix is :");
		result =  calculateDiff(firstMatrix,secondMtrix);
		displayResult(result);
		
		System.out.println("Multiplication of two Matrix is :");
		result =  calculateMulti(firstMatrix,secondMtrix);
		displayResult(result);

	}
//	Addition
	public static int[][] calculateSum(int[][] fmatrx, int[][] secmatrx) {
		int[][] sum = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = fmatrx[i][j] + secmatrx[i][j];
			}
		}
		return sum;

	}
	
//	subtraction
	public static int[][] calculateDiff(int[][] fmatrx, int[][] secmatrx) {
		int[][] sum = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = fmatrx[i][j] - secmatrx[i][j];
			}
		}
		return sum;

	}
	
//	calculate multiplication
	public static int [] [] calculateMulti(int[][] fmatrxi, int [][] secMat){
		int [][] mul = new int [3][3];
		for(int i = 0; i<3 ; i++) {
			for (int j = 0; j < 3; j++) {
				mul [i][j]= 0;
				for (int k = 0; k < 3; k++) {
					mul[i][j] += fmatrxi[i][k] * secMat[k][j];
				}
			}
		}
		return mul;
	}
	
//	display result

	public static void displayResult(int[][] result) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j] + "	");
			}
			System.out.println();
		}
	}

}
