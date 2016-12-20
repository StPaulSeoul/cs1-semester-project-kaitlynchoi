import java.util.Arrays;

public class Store {
	
	int reputation = 100;
	int budget = 1000000;

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
	public void budget(String[] flavor, String[] flavors, int[] servings, int price){
		for (int i = 0; i < flavor.length; i++){
			if (Arrays.asList(flavors).contains(flavor[i])){
				servings[i] = servings[i] - 1;
				budget = budget + price;
			}
		}
		for (int i = 0; i < flavor.length; i++){
			while (servings[i] == 0){
				budget = budget - 10000;
				servings[i] = 10;
			}
		}
		if (budget <= 0){
			System.out.println("The store is out of money!");
			
		}
	}
	Employee[] employees;
}