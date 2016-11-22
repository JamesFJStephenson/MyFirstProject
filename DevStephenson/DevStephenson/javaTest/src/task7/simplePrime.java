package task7;

public class simplePrime {
	public static void main(String[] args) {
		boolean test = false;
		int noTrue = 0;
		int[] ar = { 1, 2, 10, 20, 50, 3 };
		System.out.println(ar.length);

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				for (int k = 0; k < ar.length; k++) {
					System.out.println(i + " " + j + " " + k);
					if (i != j && i != k && k != j && (ar[i] + ar[j]) == ar[k]) {
						test = true;
						System.out.println(test);
						noTrue++;

					}
				}
			}
		}
		System.out.println("number of instances when numbers add together ="
				+ noTrue);
	}
}
