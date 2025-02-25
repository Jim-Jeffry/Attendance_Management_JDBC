package array;

public class Arr7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9,6,4,3,2,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
