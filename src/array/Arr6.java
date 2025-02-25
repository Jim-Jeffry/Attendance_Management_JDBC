package array;

public class Arr6 {
public static void main(String[] args) {
	String a[]= {"ab","ca","da","ea","fa"};
	String b[]= {"ab","ba","ca","ac","da"};
	for(int i=0;i<5;i++) {
		for (int j=0;j<5;j++) {
			if(a[i].equals(b[j])) {
			System.out.println(a[i]);	
			}
		}
	}
}
}
