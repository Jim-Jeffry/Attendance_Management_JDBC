package array;
class common{
	void com() {
		int a[]= {1,3,5,7,9};
		int b[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			
			}
		}
		
	}
}
public class Arr5 {
public static void main(String[] args) {
	common ob=new common();
	ob.com();
}
}
