package exercise;

class BadFoodException extends Exception{



}

public class Ex4 {
	public static void main(String[] args) throws BadFoodException {
     new Ex4().checkFood("nutricious junk");
	}

	void checkFood(String food) throws BadFoodException{
		if(food.contains("junk")){
			throw new BadFoodException();
		}
		else{
			System.out.println("you can eat it");
		}
	}
}
