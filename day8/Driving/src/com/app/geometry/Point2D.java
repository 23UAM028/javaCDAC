package com.app.geometry;

public class Point2D {

	private double x;
	private double y;
	
	public Point2D(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public String getdetails(){
		return ("X : "+x +"Y : "+y);
	}
	
	public boolean isEqual(Point2D a) {
		
	    return this.x == a.x && this.y == a.y;
	}
	
	public double caldis(Point2D a) {
		double dx=this.x - a.x;
		double dy=this.y - a.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}
