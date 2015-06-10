interface Sporty{
	void beSporty();
}
abstract class Ferrari implements Sporty{
	Ferrari(){		
	}
}

class GolfClub{	
}

class RacingCar extends Test1 implements Sporty{
	@Override
	public void beSporty() {
		// TODO Auto-generated method stub		
		}	
}

public class AssigningClassToInterfaceRefrenceVariable {
	public static void main(String[] args) {
       Sporty[]  sporties=new Sporty[3];
       sporties[0]=new RacingCar();
     //  sporties[1]=new GolfClub(); not fine
    //   sporties[2]=new Ferrari();  cant instantiate abstract class
       
       Ferrari ferrari=new Ferrari() {		
		@Override
		public void beSporty() {
			// TODO Auto-generated method stub
			
		}
	};
       System.out.println( ferrari instanceof Sporty );
	}
}
