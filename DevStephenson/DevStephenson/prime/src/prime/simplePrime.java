package prime;

import java.util.Arrays;

public class simplePrime {
	public static void main(String[] args) {
		
		
	
		
		
		int limit = 300;
		boolean[] primeArray = new boolean[limit];
		Arrays.fill(primeArray, true);
		
		for(int number = 2; number<limit; number++)
		{
			
				primeArray[number]=isPrime(number);

			}
		
		for(int number = 2; number<limit; number++)
		{
			
				if(primeArray[number]==true) {
					System.out.println((number));
				}

			}
			
		}
	

	
	
	public static boolean isPrime (int number){
		for (int i=2; i<number; i++){
			if (number%i==0){
				return false;
			}
			}
		return true;

	
	
	
	}
}
	
		
	

