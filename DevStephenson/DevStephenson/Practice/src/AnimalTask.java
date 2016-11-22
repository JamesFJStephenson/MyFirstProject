

public class AnimalTask{
	public static void main(String[] args){
		Dog d = new Dog(4);
		Dog d1= new Dog(6);
		whale w1 = new whale(1000.00);
		d.eat();
		System.out.println(d.getLegs());
		d1.eat();
		w1.eat();
		//w1.die();
		w1.swim();
	}
}