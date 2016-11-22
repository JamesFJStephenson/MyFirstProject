import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args)
	{
		
Scanner user_input=new Scanner(System.in);

		System.out.println("How many lines?");
int		numLines=user_input.nextInt();
	
for(int i=1;i<=numLines;i++)
{
for(int j=1;j<=i;j++)
    {
	System.out.print("*");
    }
System.out.println("");
}
	
   }
                    }


