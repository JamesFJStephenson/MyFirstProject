import java.util.ArrayList;
import java.util.List;
	

	


	public class Garage {
	List<Veh> vehicle = new ArrayList<Veh>();
	 

	 
	 
	 public void addVehicle(Veh vehicle1)
	 // Access Modifier --- Return Type --- functionName(Class Variable)
	 {
	 vehicle.add(vehicle1);
	 }
	 
	 public void print() {
		 for(Veh v: vehicle)
			 //for each veh "v" in list vehicle
			 // Class/type ---- temp variable -  objec looping over
		 {
			 System.out.println(v.weight);
			 //print weight
			 System.out.println(v.fixed);
			 System.out.println(v.colour);
		 }
	 }
	 
	 
public void removeAll(){
	vehicle.removeAll(vehicle);
	// removeAll - removes all contents in a Collection
}
	 

	} 


