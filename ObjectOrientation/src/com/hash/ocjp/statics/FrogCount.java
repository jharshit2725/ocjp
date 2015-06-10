package com.hash.ocjp.statics;

public class FrogCount {
	static int count=0;
	public FrogCount() {
		count+=1;
	}

	public static void main(String[] args) {
		new FrogCount();
		new FrogCount();
		new FrogCount();
		System.out.println("frog count is :"+count);//point no. 1
		
		FrogCount fcount=new FrogCount();
		System.out.println("frog count using instance is :"+fcount.count);//point no 2 can be accessed
		
	}
}
