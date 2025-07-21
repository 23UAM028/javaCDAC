/*Q3. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if both
points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points from
user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
`Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)
If they are not located at the same position , display distance between p1 & p2*/
package com.app.geometry;

public class Point2d {

	private double x;
	private double y;
	
	public Point2d(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public String getdetails(){
		return ("X : "+x +"Y : "+y);
	}
	
	public boolean isEqual(Point2d a) {
		
	    return this.x == a.x && this.y == a.y;
	}
	
	public double caldis(Point2d a) {
		double dx=this.x - a.x;
		double dy=this.y - a.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}
