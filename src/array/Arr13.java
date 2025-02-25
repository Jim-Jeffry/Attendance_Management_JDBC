package array;
import java.util.*;
class bla2{
	void bla() {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[100][100];
		System.out.println("Enter the Values :");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("The Value is :");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				 System.out.print(arr[i][j]+"");
	}
			System.out.println();
}
		
	}
}
public class Arr13 {
	public static void main(String[] args) {
		bla2 obj=new bla2();
		obj.bla();
	}

}
