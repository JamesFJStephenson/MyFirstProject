package task6;

public class task6 {
	public static void main(String[] args) {
		boolean birthday = false;
		int mod = 0;
		if (birthday == true) 
				{
			mod = 5;
				}
		int lowerLim = 60 + mod;
		int upperLim = 80 + mod;
		int speed = 81;
		int ticketType = 0;
		if (speed>lowerLim && speed <= upperLim)
		{
			ticketType = 1;
		}
		if (speed>upperLim){
			ticketType = 2;
		}
		System.out.println(ticketType);
	}
}
