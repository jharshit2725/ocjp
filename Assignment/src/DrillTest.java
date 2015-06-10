

class DrillTest {
	public static void main(String[] args) {
		int[][] a = {{1,2,}, {3,4}};
		int[] b = (int[]) a[1];
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		int[] b2 = (int[]) o1;
		System.out.println(b[1]);
	} }


//public class DrillTest {
//	public enum Suits {
//		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30),
//		NOTRUMP(40)
//		{ public int getValue(int bid) {
//			return ((bid-1)*30)+40; }
//		};
//		Suits(int points) { this.points = points; }
//		private int points;
//		public int getBidValue(int bid) { return points * bid; }
//	}
//	public static void main(String[] args) {
//		System.out.println(Suits.NOTRUMP.getBidValue(3));
//		System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
//		System.out.println(Suits.values());
//	}
//}

//public class DrillTest {
//
//	public static void main(String[] args) {
//
//	}
//
//	void go(int x){
//		{ 
//			for(;;)
//			{
//			int x;
//		}
//
//		}
//	}
//}
