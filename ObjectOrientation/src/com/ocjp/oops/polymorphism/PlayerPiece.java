package com.ocjp.oops.polymorphism;

public class PlayerPiece extends GameShape implements Animatable {
	
	public void movePiece(){
		System.out.println("moving game piece");
	}
	@Override
	public void animate() {
		System.out.println("Animating.....");		
	}	
	PlayerPiece piece=new PlayerPiece();
	Object object=piece;
	GameShape shape=piece;
	Animatable animatable=piece;
	

}
