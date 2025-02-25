package array;
public class Arr9 {
public static void main(String[] args) {
	int a[]= {18,28,1,24,15,23};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int b=a[i];
				a[i]=a[j];
				a[j]=b;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}