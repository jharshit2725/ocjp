package equals;

 class EqualMethod {
int i;
String s;
public EqualMethod(String as,int j) {
	i=j;
	s=as;
}
 }
public class EqualClass{
public static void main(String[] args) {
	EqualMethod eq1=new EqualMethod("hi", 10);
	EqualMethod eq2=new EqualMethod("hi", 10);
	
	System.out.println(eq1==eq2);
	System.out.println(eq1.equals(eq2));
}	
}

