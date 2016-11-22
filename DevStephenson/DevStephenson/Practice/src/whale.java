

	public class whale extends Animal {
		whale(double n){
			double weight=n;
			System.out.println(weight);
		}
		public void swim() {
			if (this.alive()){
				System.out.println("I swim");
			}
			else {
				System.out.println("I can't swim I am dead");
			}
		}
	}

