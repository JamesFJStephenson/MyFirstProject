
public class Car extends Veh {
int wheels;
Car(boolean fixed, double weight, int wheels){
	super(fixed, weight);
	// refers to class above (vehicle class) taking values from class above (Veh) and using in this class
	this.wheels=wheels;
	// constructor is setting the number of wheels to the integer wheels defined earlier
}
}
