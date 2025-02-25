package array;
public class Arr11 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,0};
	int d[]= {3,76,342,8};
	int c[]= new int[a.length+b.length+d.length];
	for(int i=0;i<a.length+b.length+d.length;i++) {
		c[i]=a[i];
		c[a.length+i]=b[i];
		c[b.length+i]=d[i];
	}
	for(int i=0;i<a.length+b.length+d.length;i++) {
		System.out.println(d[i]);
	}
		}
}