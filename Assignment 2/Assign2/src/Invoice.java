/*Q2. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/


public class Invoice {
	
	private String part;
	private String des;
	private int no;
	private double price;
	
	Invoice(String p,String d,int n,double pr){
		part=p;
		des=d;
		no=n;
		price=pr;
	}
	
	public void setp(String p) {
		this.part=p;
	}
	public void setd(String d) {
		this.des=d;
	}
	public void setno(int n) {
		if(n<0) this.no=0;
		this.no=n;
	}
	public void setpr(double pr) {
		if(pr<0) this.price=0.0;
		this.price=pr;
	}
	
	public String getp() {
		return part;
	}
	public String getd() {
		return des;
	}
	public int getn() {
		return no;
	}
	public double getpr() {
		return price;
	}
	
    public double amt() {
    	     return no*price;
    }

}
