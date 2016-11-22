import java.util.ArrayList;
import java.util.List;


public class Garage {


 List<Vehicle> vehicle = new ArrayList<Vehicle>();
 
int numCar=0;
int numLorry=0;

 
 
 public void addVehicle(Vehicle vehicle1)
 // Access Modifier --- Return Type --- functionName(Class Variable)
 {
 vehicle.add(vehicle1);
 }
 
 public void print() {
	 for(Vehicle v: vehicle)
	 {
		 System.out.println(v);
	 }
 }
 
 
 

} 


	
	
	
