package com.Fruit;


public class Fruit {
	String name;
	String color;
	double weight;
	boolean isFresh;
	
	Fruit(String n,String c,double w,boolean isF){
		name=n;
		color=c;
		weight=w;
		isFresh=isF;
	}
	public String getname(){
		return name;
		
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean Fresh) {
		isFresh=Fresh;
	}
	public String tast() {
		return"no specific taste";
	}
	@Override
	public String toString() {
		return "Fruit" +name +",Color"+color +",weight"+weight;
	}
	
	
}
