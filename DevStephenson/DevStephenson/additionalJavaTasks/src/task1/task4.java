package task1;

public class task4 {

	public static void main(String args[]) {
		String aString = ("xxbreadjambreadxx");
		char aChar[] = aString.toCharArray();
		String testString = ("bread");
		char testChar[] = testString.toCharArray();
		int bread = 0;
		StringBuilder filling = new StringBuilder();
		
		for (int i = 0; i < aString.length(); i++) {
			if (aChar[i] == testChar[0] && aString.substring(i, i + testString.length()).equals(testString)) {
				bread++;
				i = i + testString.length()-1;
			}
			if (bread > 0 && aChar[i] != testChar[0] && aChar[i] != testChar[testString.length()-1]) {
				filling.append(aChar[i]);
			}
		}
		
		if (bread >1)
		{
			System.out.println(filling);
		}

	}
	
	
	

}
