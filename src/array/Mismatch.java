package array;
import java.util.InputMismatchException;
public class Mismatch {
	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4,5,6,7,8};
			System.out.println(a[11]);
		}
		catch(Exception e){
			System.err.println("Out of Range");
		}
	}
}
