package task5;

public class task5 {
	public static void main(String[] args) {
		boolean Summer = true;
		boolean play = false;
		int lower = 60;
		int upper = 90;
		if (Summer==true){
			upper = 100;
		}
		int temperature = 95;
		
		if (lower<=temperature && upper>=temperature)
		{
			play = true;
		}
		System.out.println(play);
	}
}
