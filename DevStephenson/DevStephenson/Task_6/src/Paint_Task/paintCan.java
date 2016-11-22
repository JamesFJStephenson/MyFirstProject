package Paint_Task;



public class paintCan {
	double price;
	double coverage;
	double litres;
	double roomSize;
	String name;

	public paintCan(String name, double price, double coverage, double litres,
			double roomSize) {
		this.name = name;
		this.price = price;
		this.coverage = coverage;
		this.litres = litres;
		this.roomSize = roomSize;
	}

	public double findWaste() {
		double litresWaste = litres - roomSize%litres;
		return litresWaste;
	}
	
	public double findCost() {
		return price*Math.ceil(roomSize / litres);
	}
		
	}

	


