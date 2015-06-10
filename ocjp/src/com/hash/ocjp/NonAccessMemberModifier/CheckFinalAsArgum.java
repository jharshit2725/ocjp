package com.hash.ocjp.NonAccessMemberModifier;

public class CheckFinalAsArgum {

	final int x;
	final int y;
	int size;

	CheckFinalAsArgum(){
		x=10;
		y=13;  //can be initialized under constructor
	}

	public static void main(String[] args) {
		CheckFinalAsArgum argum=new CheckFinalAsArgum();
		argum.getRecord(2, 3);
	}

	public void getRecord(int fileNumb,final int recNumb){
		fileNumb=4;
		//	recNumb=6;	
		//	y=13; // error
	}

}
