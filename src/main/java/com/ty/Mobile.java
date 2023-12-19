package com.ty;

public class Mobile {

	
	private int cost;
	
	private String name;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile(int cost, String name) {
		
		this.cost = cost;
		this.name = name;
	}
	
	
	public Mobile() {
	
	}
	
	public void display()
	{

		System.out.println("Name : "+name);
		
		System.out.println("Cost : "+cost);
	}
	
	
}
