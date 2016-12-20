import java.util.Arrays;

public class Store {
	
	int reputation = 1;
	int budget = 1000000;
	Employee employee;
	
	public void warn(int time){
		if(reputation <= 0){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			System.out.println("The store's reputation has dropped to ground zero and no more customers come!");
		}
		else if (reputation <= 50){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			System.out.println("The reputation of the store has dropped below 50%.");
			System.out.println("Customers will come in at a slower rate until the reputation recovers.");
			time = 6;
		}
	}
	public void budget(String[] flavor, String[] flavors, int[] servings, String[] topping, String[] toppings, int[] toppingServings){
		for (int i = 0; i < flavor.length; i++){
			if(Arrays.asList(flavors).contains(flavor[i])){
				servings[i] = servings[i] - 1;
				System.out.println("~The employee refilled the ice creams.~");
			}
			if(Arrays.asList(toppings).contains(topping[i])){
				toppingServings[i] = toppingServings[i] - 1;
				System.out.println("~The employee refilled the toppings.~");
			}
		}
	}
	public void checkBudget(int budget, String[] flavor, String[] flavors, int[] servings, String[] topping, String[] toppings, int[] toppingServings){
		for (int i = 0; i < flavor.length; i++){
			if (servings[i] == 0){
				budget = budget - 100000;
				servings[i] = 10;
				}
			if (toppingServings[i] == 0){
				budget = budget - 50000;
				toppingServings[i] = 5;
			}
		}
		if (budget <= 0){
			System.out.println("The store is out of money and went bankrupt...");
		}
	}
}