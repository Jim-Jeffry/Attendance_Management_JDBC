package uniq;

public class Parameters {
	public  void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
	System.out.println(a-b);
	}
	public void div(float a, float b) {
		System.out.println(a/b);
	}
		public void mult(int a, int b) {
			System.out.println(a*b);
		}
	
	public static void main(String[]arg) {
		Parameters n=new Parameters();
		n.add(10, 40);
		n.sub(5, 10);
		n.div(45, 8);
		n.mult(43, 4);
	}

}
