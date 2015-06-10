package looping;

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}


public class EnhancedFor {
static int __________________________________________________________________ggf;
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,10};
		Animal[] animals= {new Dog(), new Cat()};
		
		for(int i=0;i<a.length;i++){    //simple for
			System.out.println(a[i]);
		}		
		for(int n:a){
			System.out.println(n);   //enhanced for
		}
		
		System.out.println("Using continue keyword to print only specific set");
		for(int i =0;i<10;i++){
			if(i<5){break;
			//	continue;
			}
			System.out.println(i);
		}
//		for (Dog animal1:animals){			//not cool
//		}
	}
	
}
