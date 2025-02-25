package uniq;
class Except extends  Exception {
	Except(String s){
		System.out.println(s);
	}
}
public class Excep {
	void m1() throws Exception{
		int a=2;
		if(a<10) {
			throw new Exception("Beyond the value");
		}
		else {
			System.out.println(a);
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Excep obj=new Excep();
		obj.m1();
	}

}
