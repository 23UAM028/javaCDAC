package com.Fruit;

public class Orange extends Fruit {
	public Orange(String name, double weight, String color, boolean isFresh) {
		super(name, color, weight, isFresh);
	}

	 @Override
	    public String tast() {
	        return "sweet n sour";
	    }

	    @Override
	    public String toString() {
	        return "Apple{name='" + name + "', color='" + color + "', weight=" + weight + "}";
	    }
	}

	


