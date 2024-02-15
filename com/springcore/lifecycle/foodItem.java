package com.springcore.lifecycle;

public class foodItem {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("setting the price for the food item");
		this.price = price;
	}

	@Override
	public String toString() {
		return "foodItem [price=" + price + "]";
	}

	public foodItem(String price) {
		super();
		this.price = price;
	}

	public foodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("inside of the bean init");
	}
	public void destroy() {
		System.out.println("bean has been distroyed!");
	}
}
