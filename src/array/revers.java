package array;
public class revers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revers r1=new revers();
		r1.rever();
	}
	void rever() {
		String a="Blabla";
		for(int i=a.length()-1;i>=0;i--) {
			String b;
			b=a.substring(i,i+1);
			System.out.print(b);
		}
	}
}