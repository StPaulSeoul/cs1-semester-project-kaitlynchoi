import java.util.ArrayList;

public class Customer extends Person{
	Employee employee;
	
	public Customer() {
		super();
	}
	
	public void enter() {
		System.out.println("~ Customer enters ~");
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
		String[] flavors = new String[4];
		System.out.println(this.adventurousness);
			if (this.adventurousness >= 3){
				for (int i = 0; i < 4; i++){
					flavors[i] = flavor[rand.nextInt(flavor.length)];
					for (int j = 0; j < i; j++){
						if (flavors[i] == flavors[j]){
							i--;
							break;
						}
					}
				}
			}
			else if(this.adventurousness <= 1){
				for (int i = 0; i < 4; i++){
					flavors[i] = this.favoriteFlavor;
					for (int j = 0; j < i; j++){
						if (flavors[i] == flavors[j]){
							i--;
							break;
						}
					}
				}
			}
			else{
				for (int i = 0; i < 4; i++){
				flavors[i] = flavor[rand.nextInt(flavor.length)];
					for (int j = 0; j < i; j++){
						if (flavors[i] == flavors[j]){
							i--;
							break;
						}
						flavors[0] = this.favoriteFlavor;
					}
				}
			}
		System.out.print(this.name + ": I would like");
		if (numFlavor == 2){
			System.out.println(" a " + flavors[0] + " and a " + flavors[1] + ".");
		}
		else if (numFlavor == 3){
			System.out.println(" a " + flavors[0] + ", a " + flavors[1] +", and a " + flavors[2] + ".");
		}
		else if (numFlavor == 4){
			System.out.println(" a " + flavors[0] + ", a " + flavors[1] +", a " + flavors[2] + ", and a " + flavors[3] + ".");
		}
		else if (flavors[0] == flavors[1]){
			System.out.println(" mine only with " + flavors[0] + " please.");
		}
		else {
			System.out.println(flavors[0] + ".");
		}
		this.employee.askTopping(flavors, numFlavor);
	}
	public void chooseTopping(String [] flavors, int numFlavor) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		String[] toppings = new String[4];
		for (int i = 0; i < 4; i++){
			flavors[i] = flavor[rand.nextInt(flavor.length)];
			for (int j = 0; j < i; j++){
				if (flavors[i] == flavors[j]){
					i--;
					break;
				}
			}
			toppings[i] = topping[rand.nextInt(topping.length)];
		}
		System.out.print(this.name + ": I want mine with ");	
		
		if (numTopping == 2){
			System.out.println(toppings[0] + " and " + toppings[1] + ".");
		}
		else if (numFlavor == 3){
			System.out.println(toppings[0] + ", " + toppings[1] +", and " + toppings[2] + ".");
		}
		else {
			System.out.println(toppings[0] + ".");
		}
		this.employee.scoop(flavors, toppings, numFlavor, numTopping);
	}
	public void thank(String[] flavors, String[] toppings){
		try{
			Thread.sleep(2500);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if (this.niceness >= 3){
			System.out.println(this.name + ": Thank you!");
		}
		else if (this.niceness >= 4){
			System.out.println(this.name + ": Thank you! Have a nice day!");
		}
		else {
			System.out.println(this.name + ": Thanks.");
		}
		this.comment(flavors, toppings);
	}
	public void comment(String[] flavors, String[] toppings){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if(flavors.contains(this.favoriteFlavor) == true && this.pickiness <= 2){
			System.out.println("I liked it.");
		}
		System.out.println("Perfect! Can't beat this.");
		this.leave();
	}
	public void leave() {
		System.out.println("~ Customer leaves ~");
	}

	public static void main(String[] args){
		ArrayList<Customer> myCustomer = new ArrayList<>();
		ArrayList<Employee> myEmployee = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			myCustomer.add(new Customer());
		}
		myEmployee.add(new Employee());
		myCustomer.get(3).employee = myEmployee.get(0);
		myEmployee.get(0).customer = myCustomer.get(3);
		
		//myCustomer.get(5); = MyCustomers[5]
		//myCustomer.remove(5);
		myCustomer.get(3).enter();
	}
}
