
public class Store {
	
	int reputation = 100;
	
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
	Employee[] employees;
}