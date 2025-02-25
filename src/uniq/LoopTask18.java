package uniq;
public class LoopTask18 {
public static void main(String[]arg) {
	for(int i=1;i<=5;i++) {
		char ch='a';
		for(int j=1;j<=i;j++) {
			if(j%2==1) {
				System.out.print((j/2)+1+" ");
			}
			else {
				System.out.print(ch+" ");
				ch++;
			}
		}
		System.out.println();
	}
}
}