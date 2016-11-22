package garageFinal;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vcl> vehicle = new ArrayList<Vcl>();

	public void addVehicle(Vcl v) {
		vehicle.add(v);
	}

	public void removeVehicle(Vcl v) {
		vehicle.remove(v);
	}

	public void emptyGarage() {
		vehicle.removeAll(vehicle);
	}

	public void print() {
		boolean garageEmpty = true;
		for (Vcl v : vehicle) {
			garageEmpty = false;
			System.out.print("ID =");
			System.out.println(v.ID);
			System.out.print("Weight = ");
			System.out.println(v.weight);
			System.out.print("Vehicle is ");
			if (v.isFixed == true) {
				System.out.println("Fixed");
			} else {
				System.out.print("Broken and bill will be ");
				System.out.println(v.findBill());

			}

			System.out.print("colour is ");
			System.out.println(v.colour);
		}
		if (garageEmpty == true) {
			System.out.println("Garage is empty");
		}
		;
	}

	public void fixAll() {
		double totalBill = 0;
		for (Vcl v : vehicle) {
			v.isFixed = true;
			totalBill = totalBill + v.findBill();
		}
		System.out.println("Total Bill is " + totalBill);
	}

}
