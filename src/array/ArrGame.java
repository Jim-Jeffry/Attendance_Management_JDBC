package array;
import java.util.Scanner;
public class ArrGame {
	static String xo[][]=new String[3][3];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<9;i++) {
			System.out.println("Enter The Value");
			int j[][]= {{sc.nextInt(),sc.nextInt()}};
			System.out.println("a["+j+"],["+j+"]");
			if(xo[i][j]==null&&i%2==0) {
				
			}
			
		}
	}
}

