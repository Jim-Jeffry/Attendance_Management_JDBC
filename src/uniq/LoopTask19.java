package uniq;
public class LoopTask19 {
//	public static void main(String[]arg) {
//		int k=1;
//		int n=1;
//		char ch='A';
//		for(int i=1;i<=5;i++) {
//		
//			for(int j=1;j<=i;j++) {
//				if(k%2==1) {
//					System.out.print(n+" ");
//					n++;
//					k++;
//				}
//				else {
//					System.out.print(ch+" ");
//					ch++;
//					k++;
//				}
//			}
//				System.out.println();
//		}
//	}
	public static void main(String[]arg) {
		int n=1;
		int p=1;
		char c='A';
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				if(p%2==1) {
					System.out.print(n+" ");
					n++;
				}
				else {
					System.out.print(c+" ");
					c++;
				}
				p++;
			}
			System.out.println();
		}
	}
	
}
