package uniq;
import java.util.Scanner;
class notification {
	String msg(String a) {
	return a;
	}
}
class whatsapp  extends notification{
	String msg(String a) {
		System.out.println("Notification From WP");
		return a;
	}
}
class Gmail  extends notification{
	String msg(String a) {
		System.out.println("Notification From Gmail");
		return a;
	}
}
class SMS  extends notification{
	String msg(String a) {
		System.out.println("Notification From SMS");
		return a;
	}
}
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose from which one you want to get msg ");
		System.out.println("Whatsapp, Gmail, SMS");
		String app=sc.next();
		if(app.equals("Whatsapp")) {
			whatsapp ob1=new whatsapp();
			System.out.println(ob1.msg(app));
		}
		else if(app.equals("Gmail")) {
			Gmail ob2=new Gmail();
			System.out.println(ob2.msg(""));
		}
		else if(app.equals("SMS")) {
			SMS ob3=new SMS();
			System.out.println(ob3.msg(app));
		}
		
		

	}

}
