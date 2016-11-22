package task3;

public class task3 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String aString = ("Hello");
		int n = 1;
		char aChar[] = aString.toCharArray();
	    char newChar[]=null;
		for (int i=1; i<aString.length()-(2*n); i++)
		{
			newChar[i]= aChar[i];
			System.out.println(aChar[i]);
		}
	}
	
}
