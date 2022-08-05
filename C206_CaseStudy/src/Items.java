
public class Items {

	public int itemID;
	public String name;
	public String category;
	public double price;
	
	public Items(int itemID, String name, String category, double price) {
		this.itemID = itemID;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public int getItemID() {
		return itemID;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}


	public double getPrice() {
		return price;
	}


	
}
