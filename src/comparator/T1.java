package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> num1=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10>o2%10) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		};
		ArrayList<Integer> num=new ArrayList<>();
		num.add(76);
		num.add(97); 
		num.add(23);
		num.add(24);
		num.add(27);
		Collections.sort(num, num1);
		System.out.println(num);
	}

}
