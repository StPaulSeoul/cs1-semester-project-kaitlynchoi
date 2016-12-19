
public class IceCream{
	//Ice creams have two characteristics- flavors and toppings.
	public static String flavor[] = {"rizzo",
	"salted caramel",
	"red bean",
	"tapioca",
	"shooting star",
	"strawberry", 
	"mint", 
	"mint chocolate", 
	"milk", 
	"cherry jubilee", 
	"coffee",
	"pineapple",
	"earl grey",
	"vanilla",
	"chocolate",
	"green tea",
	"cotton candy"
	};
	public int remaining;
	String topping[] = {"M&Ms",
	"oreos",
	"almonds",
	"popcorns",
	"cotton candy",
	"sprinkles",
	"jelly beans",
	"chocolate syrup",
	"jelly worms"};
	
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
	public static int price(int numFlavor, int numTopping){
		int icecreamPrice;
		int toppingPrice;
		//Price of ice cream depends on the size and number of toppings.
		if (numFlavor == 1){
			icecreamPrice = 3500;
		}
		else if (numFlavor == 2){
			icecreamPrice = 5500;
		}
		else if (numFlavor == 3){
			icecreamPrice = 8000;
		}
		else if (numFlavor == 4){
			icecreamPrice = 12000;
		}
		else {
			icecreamPrice = 3500;
		}
		//Price of toppings
		toppingPrice = (numTopping - 1) * 1000;
		int price = icecreamPrice + toppingPrice;
		return price;
	}
}