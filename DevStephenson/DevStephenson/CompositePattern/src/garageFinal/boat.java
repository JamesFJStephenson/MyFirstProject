package garageFinal;

public class boat extends Vcl{

int propQuality = 15;
	
	
	public boat(boolean isFixed, double weight, String colour) {
		super(isFixed, weight, colour);                        }
	

	
	public double findBill(){
		return weight*propQuality;
	}

	
		
public void makeNoise(){
	if (isFixed == true) {
	System.out.println("splash splash");
	}
	else {System.out.println("Boat is broken: Nothing");
	}
}
}
