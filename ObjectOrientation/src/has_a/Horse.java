package has_a;

public class Horse {
	private Halter halter ;

	public static void main(String[] args) {
		new Horse().tie(3);	
	}

	public void tie(int rope){
		halter = new Halter();
		halter.tie(rope);	
	}
}
