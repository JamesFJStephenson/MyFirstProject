package fib;

public class fibMethod {

	public static void output(int n){
		int[][] num = new int[n][(2 * n) + 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j] = 0;
			}
		}

		num[0][n] = 1;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < (2 * n); j++) {
				num[i][j] = num[i - 1][j - 1] + num[i - 1][j + 1];
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (2 * n) + 1; j++) {
				if (num[i][j] != 0) {
					System.out.print(num[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
