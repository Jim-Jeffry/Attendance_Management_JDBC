package MultiTasking;
import java.util.Scanner;
public class GetString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Name=\"abc\"company=\"uniq\"Experince=\"3yrs\"";
		System.out.println("Name,Company,Experince");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		if(a.equals("Name")) {
			System.out.println(input.substring(5,10));
		}
		if(a.equals("Company")) {
			System.out.println(input.substring(18,24));
		}
		if(a.equals("Experince")) {
			System.out.println(input.substring(34,40));
		}
	}

}
