package uniq;
public class LoopTask17 {
public static void main(String[]arg) {
	for(int i=1;i<=5;i++) {
		char ch='a';
		for(int j=1;j<=i;j++) {
		if(i%2==1) {
				System.out.print(ch);
				ch++;
		}		
			else
			 {
				System.out.print(j);
			 }
		}
		System.out.println();
	}
}
}