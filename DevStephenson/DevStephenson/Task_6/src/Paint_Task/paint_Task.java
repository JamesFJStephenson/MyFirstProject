package Paint_Task;
import java.util.Arrays;
import java.util.Scanner;

public class paint_Task {
	public static void main(String[] args) {
		
		
// method user input
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter room Size in m^2: ");
	    double roomSize=userInput.nextDouble();	
//method determine no of brands
        int noOfBrands = 3; 
          
        
        
	paintCan[]paints=new paintCan[noOfBrands];
	for(int i=0; i<noOfBrands; i++){
		System.out.println("Enter Brand Name: ");
		String nameTemp = userInput.next();
		System.out.println("Enter Brand Cost: ");
		double priceTemp = userInput.nextDouble();
		System.out.println("Enter litres per can : ");
		double litresTemp = userInput.nextDouble();
		System.out.println("Enter m-2 per litre : ");
		double coverageTemp = userInput.nextDouble();
		paints[i]= new paintCan(nameTemp, priceTemp, coverageTemp, litresTemp, roomSize);	
	}

	
	double cheapestPrice=1000000000;
	String cheapestBrand="error";
	for(paintCan paint:paints)
	{
		System.out.println(paint.name);
		System.out.println("Waste Litres: ");
		System.out.println(paint.findWaste()); 
		System.out.println("Paint Cost: ");
		System.out.println(paint.findCost());
		if (paint.findCost()<cheapestPrice) 
		{
			cheapestPrice=paint.findCost();
			cheapestBrand=paint.name;
		}
			
	}
	System.out.println("Cheapest Brand: ");
	System.out.println(cheapestBrand);
	System.out.println("Cheapest Price: ");
	System.out.println(cheapestPrice);
	}
	}



	
	
