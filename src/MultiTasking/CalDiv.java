package MultiTasking;
import java.util.Scanner;
@SuppressWarnings("serial")
class fix extends Exception{
	public fix(String bla) {
		super(bla);
	}
}
class Div{
	long Di(int a,int b) throws fix {
		if(a<0||b<0) {
			throw new fix("A or B Should not be Lesser Than Zero");
		}
		if(a==0||b==0) {
			throw new fix ("A or B should not be Zero");
		}
		long c=a/b;
		return c;
	}
}
public class CalDiv {
	public static void main(String[] args) throws fix {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for A and B");
		Div obj=new Div();
		System.out.println(obj.Di(sc.nextInt(), sc.nextInt()));
	}
}