public class Date{
	private int day;
	private int month;
	private int year;
	
	Date(int d,int m,int y){
		day=d;
		month=m;
		year=y;
		
	}
	public void setd(int d) {
		this.day=d;
	}
	public void setm(int m) {
		this.month=m;
	}
	public void sety(int y) {
		this.year=y;
	}
	public int getd() {
		return day;
		
	}
	public int getm() {
		return month;
	}
	public int gety() {
		return year;
	}
	 public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	}
	
}


