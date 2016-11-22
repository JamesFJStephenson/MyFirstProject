package javaTest;

class task1 {

	public static void main(String[] args) {
		int a =1;
		int testA=0;
		int b = 2;
		int testB=0;
		int c = 3;
		int testC=0;

		
		if (a!=b && a!=c) {
		
			testA=1;
			 }
		
		if (b!=a && b!=c) {
			testB=1;
			
		}
		
		if (c!=a && c!=b ){
			testC=1;
			
		}
		a = a*testA;
		b = b*testB;
		c = c*testC;
		
		System.out.println(a+b+c);
		
		
	}
}
	