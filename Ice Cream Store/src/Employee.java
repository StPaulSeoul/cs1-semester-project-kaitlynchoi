
public class Employee extends Person{
	Customer customer;
	public Employee() {
		super ();
	}
	
	public void greets(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println(this.name + ": Welcome!");
		this.askSize();
	}
	public void askSize() {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println(this.name + ": How big do you want your cup to be?");
		this.customer.chooseSize();
	}
	public void getSize(int numFlavor){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if (this.niceness >= 2){
			System.out.println(this.name + ": Sure!");
		}
		else{
			System.out.println(this.name + ": Okay.");
		}
		this.getFlavor(numFlavor);
	}
	public void getFlavor(int numFlavor){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if (numFlavor == 1 && this.niceness >= 2){
			System.out.println(this.name + ": What flavor would you like?");
		}
		else if (numFlavor == 1 && this.niceness < 2){
			System.out.println(this.name + ": Choose whatever flavor you want.");
		}
		else if(numFlavor >= 2 && this.niceness >= 2){
			System.out.println(this.name + ": What flavors would you like?");
		}
		else {
			System.out.println(this.name + ": Choose whatever flavors you want.");
		}
		this.customer.chooseFlavor(numFlavor);
	}
	public void askTopping(String [] flavors, int numFlavor){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println(this.name + ": Which toppings do you want on your ice cream?");
		this.customer.chooseTopping(flavors, numFlavor);
	}

	public void scoop(String [] flavors, String toppings[], int numFlavor, int numTopping) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		for (int i = 0; i < numFlavor; i++){
			try{
				Thread.sleep(2500);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			System.out.println("'Scoop scoop'");
		}
		this.passIcecream(flavors, toppings, numFlavor, numTopping);
	}

	public void passIcecream(String[] flavors, String[] toppings, int numFlavor, int numTopping) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if (numFlavor == 2){
			System.out.print(this.name + ": Here is your " + flavors[0] + " and " + flavors[1] + " " + icecreamSize(numFlavor) + " size ice cream with ");
			if (numTopping == 2){
				System.out.println(toppings[0] + " and " + toppings[1] + " on it.");
			}
			else if (numTopping == 3){
				System.out.println(toppings[0] + ", " + toppings[1] + ", and " + toppings[2] + " on it.");
			}
			else {
				System.out.println(toppings[0] + " on it.");
			}
		}
		else if (numFlavor == 3){
			System.out.print(this.name + ": Here is your " + flavors[0] + ", " + flavors[1] + ", and " + flavors[2] + " " + icecreamSize(numFlavor) + " size ice cream with ");
			if (numTopping == 2){
				System.out.println(toppings[0] + " and " + toppings[1] + " on it.");
			}
			else if (numTopping == 3){
				System.out.println(toppings[0] + ", " + toppings[1] + ", and " + toppings[2] + " on it.");
			}
			else {
				System.out.println(toppings[0] + " on it.");
			}
		}
		else if (numFlavor == 4){
			System.out.print(this.name + ": Here is your " + flavors[0] + ", " + flavors[1] + ", " + flavors[2] + ", and " + flavors[3] + " " + icecreamSize(numFlavor) + " ice cream, with ");
			if (numTopping == 2){
				System.out.println(toppings[0] + " and " + toppings[1] + " on it.");
			}
			else if (numTopping == 3){
				System.out.println(toppings[0] + ", " + toppings[1] + ", and " + toppings[2] + " on it.");
			}
			else {
				System.out.println(toppings[0] + " on it.");
			}
		}
		else {
			System.out.print(this.name + ": Here is your " + flavors[0] + " " + icecreamSize(numFlavor) + " size ice cream with ");
			if (numTopping == 2){
				System.out.println(toppings[0] + " and " + toppings[1] + " on it.");
			}
			else if (numTopping == 3){
				System.out.println(toppings[0] + ", " + toppings[1] + ", and " + toppings[2] + " on it.");
			}
			else {
				System.out.println(toppings[0] + " on it.");
			}
		}
		try{
			Thread.sleep(2500);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println(this.name + ": It's worth " + price(numFlavor, numTopping) + " won!");
	this.customer.thank(flavors, toppings);
	}
}