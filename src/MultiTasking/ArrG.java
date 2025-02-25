package MultiTasking;
import java.util.Arrays;
import java.util.Scanner;
class arc{
	void arr() {
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int clm[]=new int[ar.length];
		int row[]=new int[ar.length];
		int l=0;
		for(int w=0;w<ar.length;w++) {
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<ar.length;j++) {
					clm[w-1]=ar[i][j];
				}
			}
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<ar.length;j++) {
					row[w-1]=ar[j][i]; 
					boolean areEqual = Arrays.equals(clm, row);
					if(true) {
						l++;
				}
				}
			}
		}
		System.out.println(l);
	}
}
public class ArrG {
	public static void main(String[] args) {
		arc obj=new arc();
		obj.arr();
	}
}