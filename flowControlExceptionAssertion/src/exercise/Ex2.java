package exercise;

public class Ex2 {
public static void main(String[] args) {
	int age=0;
   OUTER:
	   while(age<=21){
		   ++age;
		   if(age==16){
			   System.out.println("get your driving liscence");
			   break OUTER;			   
		   }
		   System.out.println("Another Year");
	   }
}
}
