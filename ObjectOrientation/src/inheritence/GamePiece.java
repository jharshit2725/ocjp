package inheritence;

public class GamePiece extends GameShape implements Amitable{

	public void movePiece(){
		System.out.println("Moving Game Piece");
	}

	@Override
	public void animate() {
		System.out.println("Amitable interface");
		
	}
}
