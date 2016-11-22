
public class Boat extends Veh {

	int numBlades;
	
	Boat(boolean fixed, double weight, int numBlades)
	{
		super(fixed,weight);
		this.numBlades=numBlades;
	}
	
}
