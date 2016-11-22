package task1;

public class task1 {
	
	public static void main(String args[]) {
    int test = 0;
	String	aString = ("abc abc abq");
	String testString = ("abc");
	char testChar[] = testString.toCharArray();
	char aChar[] = aString.toCharArray();
	for (int i = 0; i< aChar.length-testChar.length; i++){
		if (aChar[i]==testChar[0] && aChar[i+1]==testChar[1] && aChar[i+2]==testChar[2]){
			test++;
		}
	}
	System.out.println(test);
	}

}
