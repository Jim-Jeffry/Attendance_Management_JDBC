package MultiTasking;
interface dad{
	void bold();
	void strong();
}
interface mom{
	void smart();
	void kind();
}
class son implements dad,mom{
	public void bold() {
		System.out.println("son learnt boldness from dad");
	}
	public void smart() {
		System.out.println("son learnt smartness from mom");
	}
	public void strong() {
		System.out.println("son learnt strength from dad");
	}
	public void kind() {
		System.out.println("son learnt kindness from mom");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obj=new son();
		obj.bold();
		obj.strong();
		obj.smart();
		obj.kind();
	}
}