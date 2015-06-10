package com.hash.ocjp.enumDeclaration;

public enum CoffeeSize {
	BIG(8,30),
	HUGE(12,40),
	OVERWHELMING(16,50){
		public String getLidCode(){
			return "A";
		}
	};
	CoffeeSize(int ounces, int price){
		this.ounces=ounces;
		this.price=price;
	}
	private int ounces;
	private int price;
	public int getOunces(){
		return ounces;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getLidCode(){
		return "B";
	}
}
