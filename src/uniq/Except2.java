package uniq;
class exe extends Exception{
	exe(String s){
		System.out.println(s);
	}
}
public class Except2 {
	void ep() throws Exception{
		String a="dfghj";
		String b="6678";
		if(a!=b) {
			System.out.println(67);
			throw new exe("NOt equals");
		}
		else {
			throw new exe("Equals");
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Except2 obj=new Except2();
		System.out.println(670);
		obj.ep();
		System.out.println(678);
	}
}