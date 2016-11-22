package garageFinal;

public class Car extends Vcl {

	int noOfWheels = 4;
	
	
	public Car(boolean isFixed, double weight, String colour) {
		super(isFixed, weight, colour);                       }
	

	public void fixVcl() {
		isFixed = true;
		System.out.println("Car is Fixed: Bill = " + weight*noOfWheels);
		}
	
	
	public double findBill(){
		return weight*noOfWheels;
	}

	
		
public void makeNoise(){
	if (isFixed == true) {
	System.out.println("Car Vroom");
	}
	else {System.out.println("Car is broken: Nothing");
	}
}
	
}		
		
		


