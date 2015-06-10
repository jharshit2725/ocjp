class Foo {
	public void doFooStuff() { }
	public void doStuff() { }
}
class Bar extends Foo {
	public void doBarStuff() { }
	public void doStuff() { }
}
public class Test4 {
	public static void main (String [] args) {
		Foo reallyABar = new Bar(); // Legal because Bar is a subclass of Foo
		// Bar reallyAFoo = new Foo(); // Illegal! Foo is not a subclass of Bar
		Bar reallyABar1 = (Bar) new Foo(); // legal only after casting
		reallyABar1.doStuff();
	}
}