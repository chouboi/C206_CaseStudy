
public class Order {

	public int ID;
	public String date;
	public String meal;
	public String drink;
	public String fruit;
	private boolean isAvailable;

	public Order(int ID, String date, String meal, String drink, String fruit) {
		this.ID = ID;
		this.date = date;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
	}

	public int getID() {
		return ID;
	}

	public String getDate() {
		return date;
	}

	public String getMeal() {
		return meal;
	}

	public String getDrink() {
		return drink;
	}

	public String getFruit() {
		return fruit;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}