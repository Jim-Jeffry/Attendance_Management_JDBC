package oops;
import java.util.*;
class Enscaps1{
	String id="Jim";
	private int pswd=5272;
	public int getpswd() {
		return pswd;
	}
	public void setpswd(int newpswd) {
		this.pswd=newpswd;
	}
}
public class Enscapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Enscaps1 obj=new Enscaps1();
		System.out.println(obj.id+" "+obj.getpswd());
		System.out.println("Enter The New Password");
		int newpswd=sc.nextInt();
		obj.setpswd(newpswd);
		System.out.println(obj.id+" "+obj.getpswd());
	}
}