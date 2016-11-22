package task9;

public class diamond {

	public static void main(String[] args) {
		int n=10;
		int[][] num = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j] = 0;
			}
		}
	
num[1][(n/2)-1]=1;
num[n-1][(n/2)-1]=1;
	
		for (int i = 0; i <= n/2; i++)  {
		for (int j = 1; j < n-1; j++) {
			if (num[i][j]==1){
					num[i + 1][j] = 1;
					num[i + 1][j-1]=1;
					num[i + 1][j+1]=1;
				}
			}
		}
		
// fill in top 
		
		for (int i = n-1; i >= n/2; i--)  {
	    for (int j = 1; j < n-1; j++) {
	    	if (num[i][j]==1){
				num[i - 1][j] = 1;
				num[i - 1][j-1]=1;
				num[i - 1][j+1]=1;
					}
				}
			}

	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) { 
				if (num[i][j]==1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println("");
		}
	
}
}
