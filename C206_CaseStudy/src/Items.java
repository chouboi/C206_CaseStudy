
public class Items {
	public String itemID;
	public String name;
	public String category;
	public String price;
	private boolean isAvailable;
	
	public Items(String itemID, String name, String category, String price) {
		this.itemID = itemID;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}


	public String getPrice() {
		return price;
	}

	public String toString(){
		String output = "";
		return output;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
