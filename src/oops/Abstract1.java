package oops;
abstract class person{
	abstract void eat();
	abstract void exercise();
	void fresh() {
		System.out.println("Neutral");
	}
}
class athelet extends person{
	void eat() {
		System.out.println("Athelets eats diet food");
	}
	void exercise() {
		System.out.println("Athelets take continuous workout");
	}
	void fresh(){
		System.out.println("Athelets maintain proper Freshness");
	}
}
class lazy extends person{
	void eat() {
		System.out.println("Lazy Person  eats junk food");
	}
	void exercise() {
		System.out.println("Lazy person take continuous rest");
	}
	void fresh(){
		System.out.println("Lazy person won't maintain proper Freshness");
	}
}
public class Abstract1 {
	public static void main(String[] args) {
	athelet a=new athelet();
	lazy b=new lazy();
	a.eat();
	a.exercise();
	a.fresh();
	b.eat();
	b.exercise();
	b.fresh();
	}
}