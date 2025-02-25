package java8;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Streamn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> al=Arrays.asList(30,1,20,5,25,40,7,7,30,20);
      System.out.println(al);
     // al.stream().forEach(a->{System.out.println(a);});
      al.stream().filter(b->b>15).forEach(r->System.out.println(r));
      List<Integer> list=al.stream().filter(e->e%2==0).collect(Collectors.toList());
	  System.out.println(list);
	  
	  System.out.println( al.stream().map(p->p*10).collect(Collectors.toList()));	
	  System.out.println(al.stream().sorted().collect(Collectors.toList()));
	  System.out.println(al.stream().sorted((x,y)->y-x).collect(Collectors.toList()));
	  System.out.println(al.stream().sorted().distinct().collect(Collectors.toList()));
	  
	  List<Integer> al2=Arrays.asList(100,200,300);
	  List<Integer> al3=Arrays.asList(10,20,30);
	  List<Integer> al4=Arrays.asList(1,2,3);
	  List<List<Integer>> al5=Arrays.asList(al2,al3,al4);
	  System.out.println(al5);
	  
	  System.out.println(al5.stream().flatMap(q->q.stream()).collect(Collectors.toList()));
	  System.out.println(al.stream().limit(5).collect(Collectors.toList()));
       
	  System.out.println(al.stream().limit(5).skip(2).collect(Collectors.toList()));
	}

}