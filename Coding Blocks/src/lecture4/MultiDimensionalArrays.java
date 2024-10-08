package lecture4;

	import java.util.Scanner;

	public class MultiDimensionalArrays {

		public static int[][] takeInput() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter num Rows");
			int m = s.nextInt();
			System.out.println("Enter num Cols");
			int n = s.nextInt();
			
			int[][] output = new int[m][n];
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.println("Enter data for " + i + "th row and " + j + "th col");
					output[i][j] = s.nextInt();
				}
			}
			return output;
		}
		
		public static void print2DArray(int[][] input) {
			for (int i = 0; i < input.length; i++) {
//				if (input[i] == null) {
//					System.out.println();
//					continue;
//				}
				for (int j = 0; j < input[i].length; j++) {
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			
//			int [] a = {1,2,3,5};
//			int [][] b = {{1,2,3,4},{5,6,7,8},{7,8,9,10}};
//			print2DArray(b);
			
			
			int[][] input = takeInput();
			// 123
			// 456
			// 789
			input[0] = new int[5];
			print2DArray(input);
			
			// variable sized 2d arrays
//			int[][] a = new int[10][];
//			for (int i = 0; i < 10; i++) {
//				a[i] = new int[i + 1];
//				
//			}
			
//			System.out.println("arr = "+a[i]);
//			System.out.println(a[4][3]);
//			System.out.println(a[4][4]);
//			System.out.println(a[4][5]);
			
			// 2d arrays
//			int[][] a = new int[10][5];
//			int[] z = new int[10];
//			
//			a[3] = new int[100];
//			
//			System.out.println("Array = "+a);
//			
//			System.out.println("Hello123 = "+a[5][3]);
// 			System.out.println("Hello 2D = "+a[5]);
//			System.out.println("hello = "+z[5]);
		}

	}
