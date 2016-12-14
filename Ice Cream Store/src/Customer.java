public class Customer extends Person{
	Employee employee;
	
	public Customer(String name) {
		super(name);
	}
	
	public void enter() {
		System.out.println("~ A customer enters ~");
		this.employee.greets();
	}
	public void chooseSize() {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println(this.name + ": A " + cupsize + ", please.");
		this.employee.getSize(numFlavor);
	}
	public void chooseFlavor(int numFlavor){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.print(this.name + ": I would like ");
		for (int i = 0; i > numFlavor; i++){
			System.out.print(flavor);
			for (int j = 0; j > numFlavor - 1; j++){
			System.out.print(",");
			}
		}
		System.out.println(".");
		this.employee.askTopping(flavor, numFlavor);
	}
	public void chooseTopping(String[] flavor, int numFlavor) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.print(this.name + ": I would want ");
		for (int i = 0; i > Math.abs(rand.nextInt(flavor.length)); i++){
			System.out.print(topping);
			for (int j = 0; j > Math.abs(rand.nextInt(flavor.length))- 1; j++){
				System.out.print(",");
			}
			System.out.println(".");
			this.employee.scoop(flavor, topping, numFlavor);
		}
	}
	public void thank(){
		if (this.niceness >= 3){
			System.out.println(this.name + ": Thank you!");
		}
		else if (this.niceness >= 4){
			System.out.println(this.name + ": Thank you! Have a nice day!");
		}
		else {
			System.out.println(this.name + ": Thanks.");
		}
	}
	public void comment(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}
}
