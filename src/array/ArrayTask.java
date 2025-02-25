package array;



class check{
	void check() {
		int a[]= {1,5,7,4,2};
		int a1 ;
		 for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }
//		Arrays.sort(a);
//		String a1=Arrays.toString(a);
//		System.out.println(Arrays.toString(a));
		 for (int i = 0; i < a.length; i++) {     
	            for (int j = i+1; j < a.length; j++) {     
	               if(a[i]>a[j]) {    
	                   a1 = a[i];    
	                   a[i] = a[j];    
	                   a[j] = a1;    
	               }     
	            }     
	        }
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println(a[2]);
		System.out.println(a[a.length-1]);
	}
	
}
public class ArrayTask {
public static void main(String[] args) {
	check obj=new check();
	obj.check();
}
}
