package Collection;

import java.util.HashSet;

public class task {

	public static void main(String[] args) {
		 HashSet <Integer> h1=new HashSet<>();
		HashSet <Integer> h2=new HashSet<>();
		HashSet <Integer> h3=new HashSet<>();
		HashSet <Integer> h4=new HashSet<>();
		int a[]= {1,2,5,4,3,6,8};
		int b[]= {10,2,2,5,1,7,0};
		for (int num : a) {
            h1.add(num);
        }
        for (int num : b) {
            h2.add(num);
        }
        for(int i=0;i<a.length;i++) {
        	if (h2.contains(a[i])) {
                h3.add(a[i]); 
            }
        	if(!h2.contains(a[i])) {
        		h4.add(a[i]);
        	}
        }
        for(int i=0;i<b.length;i++) {
        	 if (!h1.contains(b[i])) {
                 h4.add(b[i]);
             }	
        }
        
        h1.removeAll(h1);
        h1.addAll(h3);
        h2.removeAll(h2);
        h2.addAll(h4);
        System.out.println("Common values : "+h1);
        System.out.println("Diffrent value : "+h2);
		}

	}
