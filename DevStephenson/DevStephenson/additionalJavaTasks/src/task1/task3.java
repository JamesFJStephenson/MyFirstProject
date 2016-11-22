package task1;

public class task3 {

	public static void main(String args[]){
		String aString = ("aaacodeaacodeaacodeaacopeaaconeaa code");
		char aChar[] = new char[aString.length()];
		String testString  = ("code");
		char newChar[] = new char[testString.length()];
		int count = 0;
		for (int i =1; i<(aString.length()-testString.length());i++)
		{
			if (aChar[i]==newChar[0] && aChar[i+1]==newChar[1] && aChar[i+3]==newChar[3])
			{
				count++;
				i = i + testString.length();
			}
		}
		
		System.out.println(count);
		
	}
	
}
