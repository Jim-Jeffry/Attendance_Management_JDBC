package MultiTasking;
import java.util.Arrays;
import java.util.Scanner;
public class ArrGam {
	void arr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ar[][]=new int[a][b];
		System.out.println("Enter the array value");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int l=0;
		for (int w = 0; w < ar.length; w++) {
			int clm[]=new int[ar.length];
			int row[]=new int[ar.length];
            for (int j = 0; j < ar.length; j++) {
                row[j] = ar[w][j];
            }
            for (int i = 0; i < 3; i++) {
                clm[i] = ar[i][w];
            }
            if(Arrays.equals(clm,ar[w])) {
            	l++;
            }
		}
		System.out.println("The number times the same got "+l);
	}
	public static void main(String[] args) {
		ArrGam obj= new ArrGam();
		obj.arr();
	}
}