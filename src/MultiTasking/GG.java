package MultiTasking;
import java.util.*;
public class GG {
	void ase() {
		int b=5;
		int c=0;
		int a[] = new int[b] ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input");
		for(int i=0;i<b;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				if(a[i]<a[j]) {
				c=a[i];
				a[i]=a[j];
				a[j]=c;
				}
			}
			
			System.out.println(a[i]);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GG ob=new GG();
		ob.ase();
	}

}
