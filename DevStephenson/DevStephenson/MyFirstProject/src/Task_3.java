

public class Task_3 {

	public static void main(String[] args)
	{
	
		 String aString="WASSUP";
		 char aChar[] = aString.toCharArray();
		 char newChar[] = aString.toCharArray();
		 
for(int i=0; i<aString.length(); i++)
{
newChar[i]=aChar[aString.length()-i-1];
System.out.println(newChar[i]);
}
	 	

    }
                    }


