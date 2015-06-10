package com.hash.ocjp.enumDeclaration;
public class CoffeeWithOunces {
	CoffeeSize size ;

	public static void main(String[] args) {
		CoffeeWithOunces drink1=new CoffeeWithOunces();
		drink1.size=CoffeeSize.BIG;

		CoffeeWithOunces drink2=new CoffeeWithOunces();
		drink2.size=CoffeeSize.HUGE;

		System.out.println(drink2.size.getOunces());

		for(CoffeeSize cs:CoffeeSize.values())	{
			System.out.println(CoffeeSize.values());
			System.out.println(cs+"-ounce:"+cs.getOunces()+
					" price:"+cs.getPrice()+" lidCode:"+cs.getLidCode());
		}
	}
}
