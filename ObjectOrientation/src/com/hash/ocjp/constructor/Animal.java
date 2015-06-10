package com.hash.ocjp.constructor; public class Animal {
	String name;
	Animal(String n){
		this.name=n;
	}	
	
	Animal(){		
		this(getRandomName());                
	}
	
	static String getRandomName(){
		int x=(int) (Math.random()*5);
		System.out.println(x+1);
		String nam = new String[] {"Dog","peacock","Ostrich","Hyena","Buffalo"}[x];
		return nam;
	}
	
	public static void main(String[] args) {
		Animal animal=new Animal("Default Animal");
		System.out.println(animal.name);
		Animal animal2=new Animal();
		System.out.println(animal2.name);
		
	}
}
