package task2;

public class task2 {
	public static void main(String[] args) {
		int a = 19;
		int b = 22;
		int testA = 0;
		int testB = 0;
		if (a <= 21) {
			testA = 1;
			
		}
		if (b <= 21) {
			testB = 1;
		}

		a = a * testA;
		b = b * testB;

		if ((21 - a) < (21 - b)) {
			System.out.println(a);
		}
		if ((21 - b) < (21 - a)) {
			System.out.println(b);
		} 
		if (a==b){
			System.out.println(a);
		}
	}
}
