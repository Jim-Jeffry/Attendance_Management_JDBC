package array;
import java.util.Arrays;
public class Arr10 {

		public static void main(String[] args) {
			int ar[]= {90,56,89,12,67,45,95};
			
			Arrays.sort(ar);
			for(int i=0;i<=ar.length-1;i++) {
				System.out.print(ar[i]+"  ");
			}
			System.out.println();
			int a=Arrays.binarySearch(ar, 45);
			int a1=Arrays.binarySearch(ar,1,5,45);
			System.out.println();
			System.out.println(a);
			System.out.println();
	      System.out.println(a1);
			int arr[]=Arrays.copyOf(ar, 6);
			int arr1[]=Arrays.copyOfRange(ar, 2, 5);
			for(int i=0;i<=arr1.length-1;i++) {
				System.out.println();
				System.out.print(arr1[i]+"  ");
			}
	      Arrays.fill(ar, 12);
			Arrays.fill(ar,2,5, 89);
			for(int i=0;i<=ar.length-1;i++) {
				System.out.println();
				System.out.print(ar[i]+"  ");
			}
			String s[]= {"java","python","DSA"};
			String s1[]= {"java","DSA"};
			System.out.println();
	System.out.println(Arrays.compare(s,s1));
	System.out.println();
		System.out.println(Arrays.equals(s, s1));
		System.out.println();
			System.out.println(Arrays.mismatch(s, s1));
			System.out.println(Arrays.mismatch(s,s1));	
			System.out.println(Arrays.compare(s, s1));
			int b[]= {1,2,3,4,5};
			int b1[]= {1,3,4,5,2};
			System.out.println(Arrays.compare(b, b1));
		}

	
}
