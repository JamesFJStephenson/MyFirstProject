import java.util.Scanner;

public class task_6 {

	public static void main(String[] args)
	{
		Scanner r = new Scanner(System.in);
		double rSize;
		System.out.println("Enter room Size in m^2: ");
		rSize = r.nextDouble();
		System.out.println("Room Size in m^2 = ");
		System.out.println(rSize);
		
		// Find cost for each room using each paint#
		double litresCM = 20;
		double litresAJ = 15;
		double litresDP = 10;
		double coverageCM = 10;
		double coverageAJ = 11;
		double coverageDP = 20;
		double volumeCM = litresCM*coverageCM;
		double volumeAJ = litresAJ*coverageAJ;
		double volumeDP = litresDP*coverageDP;
		double priceCM = 19.99;
		double priceAJ = 17.99;
		double priceDP = 25;

		// Find cost using CM
		double wasteCM = volumeCM - rSize%volumeCM;
		double wasteAJ = volumeAJ - rSize%volumeAJ;
		double wasteDP = volumeDP - rSize%volumeDP;
		double costCM = priceCM*Math.ceil(rSize/volumeCM);
		double costAJ = priceAJ*Math.ceil(rSize/volumeAJ);
		double costDP = priceDP*Math.ceil(rSize/volumeDP);
		
		if (costCM<costAJ && costCM<costDP){
			System.out.println("Cheapest option is CheapoMax at ");
			System.out.println(costCM);    
		    System.out.println("Waste = ");
		    System.out.println(wasteCM);}
			else if (costAJ<costCM && costAJ<costDP) {
			System.out.println("Cheapest option is AverageJoes at ");
			System.out.println(costAJ);              
			System.out.println("Waste = ");
			System.out.println(wasteAJ);}
			else if (costDP<costCM && costDP<costAJ) {
			System.out.println("Cheapest option is DuluxorousPaints at ");
			System.out.println(costDP);              
			System.out.println("Waste = ");
			System.out.println(wasteDP);}
		    else {System.out.println("error");}
		    

		    
			
			
		}
			
		
    }

