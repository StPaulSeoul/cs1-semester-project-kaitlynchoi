
public class Employee extends Person{
	Customer customer;
	public Employee(String name) {
		super (name);
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
			System.out.println(this.name + ": hoose whatever flavors you want.");
		}
		this.customer.chooseFlavor(numFlavor);
	}
	public void askTopping(String[] flavor, int numFlavor){
		System.out.println(this.name + ": What topping do you want on your ice cream?");
		this.customer.chooseTopping(flavor, numFlavor);
	}

	public void scoop(String[] flavor, String[] topping, int numFlavor) {
		for (int i = 0; i > flavor.length; i++){
		System.out.println("'Scoop scoop'");
		}
		this.passIcecream(flavor, topping, numFlavor);
	}

	public void passIcecream(String[] flavor, String[] topping, int numFlavor) {
		System.out.println(this.name + ": Here is your " + icecreamSize(numFlavor) + " ice cream, with " + flavor + " in it and " + topping + " on the top!");
		System.out.println(this.name + ": ");
	}
}