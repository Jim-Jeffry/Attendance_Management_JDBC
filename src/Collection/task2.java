package Collection;
class a{
	void m1(String[] ar) {
		System.out.println(ar);
	}
}
public class task2 {
	private task2(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task2 obj=new task2();
		String []ar= {"oseo"};
		System.out.println(ar);
		a obj1=new a();
		obj1.m1(ar);
		
	}
}