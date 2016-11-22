package garageFinal;

import java.util.ArrayList;
import java.util.List;

public class Vcl {

	boolean isFixed = true;
	double weight;
	String colour;
	int ID;
	static int currentID =1;



	public Vcl(boolean isFixed, double weight, String colour) {
		this.isFixed = isFixed;
		this.weight = weight;
		this.colour = colour;
		this.ID=currentID;
		this.currentID++;
	}

	public void makeNoise() {
		if (isFixed == true) {
			System.out.println("V Vroom");
		} else {
			System.out.println("Vcle is broken: Nothing");
		}
	}


	
	public void colour() {
		System.out.println("Veichle is " + colour);
	}
	
	public boolean fixVcl() {
		System.out.println("Car is Fixed: Bill = " + 1000);
		return isFixed = true;
	}
	
public double findBill() {
return 1000;	
}

	public List<Vcl> makeList() {
		List<Vcl> vclList = new ArrayList<Vcl>();
		return vclList;
	}
}
