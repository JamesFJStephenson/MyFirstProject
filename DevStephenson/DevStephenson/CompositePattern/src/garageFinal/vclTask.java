package garageFinal;






public class vclTask {
public static void main(String[] args) {

boolean fixed = true;
boolean notFixed = false;

//List<Vcl> vehicle = new ArrayList<Vcl>();
	Garage g = new Garage();

	Car C1 = new Car(notFixed, 520, "green");
	g.addVehicle(C1);
	Car C2 = new Car(notFixed, 1620, "peng");
	g.addVehicle(C2);
	boat b1 = new boat(notFixed, 1600, "orange");
	g.addVehicle(b1);
	boat b2 = new boat(fixed, 1600, "orange");
	g.addVehicle(b1);
	
//g.print();

//g.removeVehicle(V2);

//g.print();

	

//	g.fixAll();
	
	
	b2.fixVcl();
	

	
	
}
}


