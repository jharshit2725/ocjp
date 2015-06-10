package com.hash.ocjp.arrayDec;
import java.awt.List;
import java.util.ArrayList;

import com.hash.ocjp.check1.Drinks;

public class Beverage extends Drinks{
	int[] a;
	Beverage [] beverages;
	Beverage beverage;
	//	int[5] b;     // can't allocate size while declaration	
	Drinks[] drinks;
	Drinks drink;
	final int x=10;
	int array[][];
	int []array1[];
	int[][] array2;
	int ____arrays$__ ;
	
	public void childObjArray() {
		drinks[1]=beverage;
	}
	public void parentObjArray() {
	//	beverages[1]=drink;         showing typecaste error
	}		
	void maxLimit(){
	//	x=15;         // unable to change final value		
	}
	public Beverage(){
    //	x=15;         // unable to change final value		  
	}	
	public void display(){
		int a;
	//	System.out.println("local variable a's value is: "+a);//error due to non initialization of local variable
	Beverage[] beverages;
		
		int[] as={1,2,3};
	int[] bs={1,2,3};
	bs.equals(as);
	
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	}
}
