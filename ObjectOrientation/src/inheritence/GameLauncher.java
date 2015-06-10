package inheritence;

public class GameLauncher {

	public static void main(String[] args) {
		GamePiece gamePiece=new GamePiece();
		TilePiece tilePiece=new TilePiece();
		displayGameShape(gamePiece);
		displayGameShape(tilePiece);
		
	}
	
	public static void displayGameShape(GameShape shape){
		shape.displayShape();
		if(shape instanceof GamePiece){
		GamePiece gamePiece=(GamePiece) shape;
		gamePiece.movePiece();
		}
	}
}
