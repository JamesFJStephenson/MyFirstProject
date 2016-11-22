
public class garageFiller {

	public static void main(String[] args)
	{
	Garage g = new Garage();
	Veh c = new Car(true, 600, 9);
	Veh c1 = new Car(true, 60, 9);
	g.addVehicle(c);
	g.addVehicle(c1);
	//g.removeAll();
	g.print();
    }
	
}