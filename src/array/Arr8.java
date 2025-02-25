package array;
public class Arr8 {
	public static void main(String[] args) {
		int a[]= {10,5,8,12,15,20};
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]<a[j]) {
				int	b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}			
	}
}  