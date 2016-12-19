import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Person{
	Employee employee;
	public Customer() {
		super();
	}
	
	public void enter() {
		this.employee.store.warn(time);
		
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
		//Depending on the customer's adventurousness, their choice of flavors changes.
		//The double for loop checks for overlapping values.
			if (this.adventurousness >= 3){
				//If quite adventurous, completely random choice of flavors
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
				//Cowards stick to their favorite flavor.
				for (int i = 0; i < 4; i++){
					flavors[i] = this.favoriteFlavor;
				}
			}
			else{
				//If somewhat adventurous, they will still include their favorite flavor
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
		//Fitting in grammar
		if (numFlavor == 2 && flavors[0] != flavors[1]){
			System.out.println(" a " + flavors[0] + " and a " + flavors[1] + ".");
		}
		else if (numFlavor == 3 && flavors[0] != flavors[1]){
			System.out.println(" a " + flavors[0] + ", a " + flavors[1] +", and a " + flavors[2] + ".");
		}
		else if (numFlavor == 4 && flavors[0] != flavors[1]){
			System.out.println(" a " + flavors[0] + ", a " + flavors[1] +", a " + flavors[2] + ", and a " + flavors[3] + ".");
		}
		else if (flavors[0] == flavors[1]){
			//If chooses to fill whole cup with one flavor
			System.out.println(" mine only with " + flavors[0] + ", please.");
		}
		else {
			System.out.println(" a " + flavors[0] + ", please.");
		}
		this.employee.askTopping(flavors, numFlavor);
	}
	
	
	public void chooseTopping(String[] flavors, int numFlavor) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		String[] toppings = new String[4];
		//Double for loop checks for overlapping toppings
		for (int i = 0; i < 4; i++){
			toppings[i] = topping[rand.nextInt(topping.length)];
			for (int j = 0; j < i; j++){
				if (toppings[i].equals(toppings[j])){
					i--;
					break;
				}
			}
		}
		System.out.print(this.name + ": I want mine with ");	
		//Fitting in grammar
		if (numTopping == 2){
			System.out.println(toppings[0] + " and " + toppings[1] + ".");
		}
		else if (numTopping == 3){
			System.out.println(toppings[0] + ", " + toppings[1] + ", and " + toppings[2] + ".");
		}
		else {
			System.out.println(toppings[0] + ".");
		}
		this.employee.scoop(flavors, toppings, numFlavor, numTopping);
	}
	public void thank(String[] flavors, String[] toppings){
		//Their way of thanking the employee differs depending on their niceness.
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
		//The customer's niceness, pickiness, and favorite flavor all come into 
		//action when making comments and affecting the store's reputation.
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		if(Arrays.asList(flavors).contains(this.favoriteFlavor) == true && this.pickiness <= 2){
			System.out.println(this.name + ": 'Perfect! Nothing can beat this.'");
			this.employee.store.reputation += 10;
		}
		else if (this.pickiness <= 1){
			//People who are not picky at all will always just go with what they have.
			System.out.println(this.name + ": 'Ice cream is always the best.'");
			this.employee.store.reputation += 5;
		}
		else if((Arrays.asList(flavors).contains(this.favoriteFlavor) == false || this.pickiness >= 4)  && this.niceness <= 3){
			System.out.println(this.name + ": 'It wasn't that bad.'");
		}
		else if ((Arrays.asList(flavors).contains(this.favoriteFlavor) == false || this.pickiness >= 4 ) && this.niceness > 3 ){
			System.out.println(this.name + ": 'Ewww! Did I just pay for this?'");
			this.employee.store.reputation -= 15;
		}
		else{
			System.out.println(this.name + ": 'It was good, I guess.'");
			this.employee.store.reputation += 1;
		}
	}
	public void leave() {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println("~ Customer leaves ~");
		for (int i = 0; i < time; i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		System.out.println(".");
		}
	}
	public static void main(String[] args){
		ArrayList<Customer> myCustomer = new ArrayList<>();
		ArrayList<Employee> myEmployee = new ArrayList<>();
		Store myStore = new Store();
		for(int i = 0; i < 10; i++){
			myCustomer.add(new Customer());
		}
		myEmployee.add(new Employee());
		while(myCustomer.size() > 0 && myStore.reputation > 0){
			myCustomer.get(0).employee = myEmployee.get(0);
			myEmployee.get(0).customer = myCustomer.get(0);
			myEmployee.get(0).store = myStore;
		
			myCustomer.get(0).enter();
			myCustomer.remove(0).leave();
		}
	}
}
