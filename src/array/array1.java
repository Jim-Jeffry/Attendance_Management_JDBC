package array;
import java.util.Scanner;
import java.util.Arrays;
public class array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int arr[]  = new int[N];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
        int i=0;
        if(arr[i]!=arr[i++]) {
        	System.out.println("Second Smallest"+arr[1]);
        }
        else {
        System.out.println("Second Smallest"+arr[2]);
        }
        System.out.println("Second Greatest"+arr[arr.length-2]);
    }    
}