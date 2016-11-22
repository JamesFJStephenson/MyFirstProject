package task4;

public class task4 {
	public static void main(String[] args) {
		String aString = "kudghfioasgyfy";
		String test= "ly";
		char aChar[] = aString.toCharArray();
        char ly[] = test.toCharArray();

        
        if (aString.length()>=2) {
		
			if (aChar[aString.length()-1] == ly[1] && aChar[aString.length()-2] == ly[0]) 
			{
				System.out.println("true");  
			}
			else {
				System.out.println("false"); 
			}
			
        }
        else {
        	System.out.println("false"); 
        }
        
			
	}
}
		