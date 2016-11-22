package task1;

public class task2 {
	public static void main(String args[]) {
		String aString = ("WHAAADAYDO??");
		char aChar[] = aString.toCharArray();
		char newChar[] = new char[2*aChar.length];

		
		
		for (int i = 0; i< aChar.length; i++){
			newChar[2*i]=aChar[i];
			newChar[(2*i)+1] = aChar[i];
		}
		
		StringBuilder strBuilder = new StringBuilder();
		for (int i=0; i < newChar.length; i++){
			strBuilder.append(newChar[i]);
		}
		System.out.println(strBuilder.toString());
		
		
		}

		}
