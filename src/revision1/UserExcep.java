package revision1;
class ep extends Exception{
	ep(String s) {
		System.out.println(s);
	}
}
public class UserExcep {
	public void m1() throws ep{
		int a=8;
		int b=3;
		if(a==b) {
			throw new ep("ciywqvkqu");
		}
		else {
			throw new ep("dfghjk");
		}
	}
	public static void main(String[] args) throws ep{
		// TODO Auto-generated method stub
		UserExcep obj=new UserExcep();
		obj.m1();
		System.out.println(324567);
	}
}
