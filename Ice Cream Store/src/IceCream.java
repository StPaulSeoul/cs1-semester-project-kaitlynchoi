
public class IceCream{
	String flavor[] = {"chocolate", 
	"vanilla", 
	"green Tea", 
	"rizzo", 
	"strawberry", 
	"mint", 
	"mint chocolate", 
	"milk", 
	"shooting star", 
	"cotton candy", 
	"cherry jubilee", 
	"caramel", 
	"red bean",
	"pineapple",
	"earl grey",
	"salted caramel"
	};
	String topping[] = {"with M&Ms",
	"with oreos",
	"with almonds",
	"with popcorns",
	"with cotton candy",
	"with sprinkles",
	"with jelly beans",
	"with chocolate syrup",
	"without anything"};
	
	public static String icecreamSize(int numFlavor){
		String size;
		if (numFlavor == 1){
			size = "single";
		}
		else if (numFlavor == 2){
			size = "double";
		}
		else if (numFlavor == 3){
			size = "triple";
		}
		else if (numFlavor == 4){
			size = "family size";
		}
		else {
			size = "single";
		}
		return size;
	}
	public static int price(int numFlavor){
		int price;
		if (numFlavor == 1){
			price = 3500;
		}
		else if (numFlavor == 2){
			price = 5500;
		}
		else if (numFlavor == 3){
			price = 8000;
		}
		else if (numFlavor == 4){
			price = 12000;
		}
		else {
			price = 3500;
		}
		return price;
	}
	
}