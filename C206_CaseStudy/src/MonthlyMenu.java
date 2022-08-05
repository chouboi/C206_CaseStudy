
public class MonthlyMenu {
	
	private int id;
	private String weekDate;
	private String western;
	private String asian;
	private String vegg;
	private String d1;
	private String d2;
	private String f1;
	private String f2;
	
	
	public MonthlyMenu(int id,String weekDate,String western,String asian,String vegg,String d1,String d2,String f1,String f2) {
		this.id = id;
		this.weekDate = weekDate;
		this.western =western;
		this.asian = asian;
		this.vegg = vegg;
		this.d1 = d1;
		this.d2 = d2;
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public int getID() {
		return id;
	}
	
	public String GetWeekDate(){
		return weekDate;
	}
	
	public String Getwestern(){
		return western;
	}
	
	public String Getasian(){
		return asian;
	}
	
	public String Getvegg(){
		return vegg;
	}
	
	public String Getdrink1(){
		return d1;
	}
	
	public String Getdrink2(){
		return d2;
	}
	
	public String Getfruit1(){
		return f1;
	}
	
	public String Getfruit2(){
		return f2;
	}
	

	
}
