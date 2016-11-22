public class Animal {
protected int legs;
private boolean isAlive = true;

public Animal()
{
this.isAlive=isAlive;
}

public void eat() {
	System.out.println("nomnom");
}

public void die() {
	isAlive = false;
	System.out.println("I die");
}

public boolean alive() {
	return isAlive;
}

public int getLegs(){
	return this.legs;
}


}