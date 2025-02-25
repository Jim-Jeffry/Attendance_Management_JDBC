package uniq;
import java.util.*;
class Detail{
	String Name=("Jim");
	int Age=21;
	String Location=("Kanniyakumari");
}
class CourseDetail{
	String Coursename=("B.E Mechanical");
	String Location=("Kanniyakumari");
}
class Mark{
	static int I=78;
	static int II=75;
	static int III=93;
	static int IV=88;
	static int total=(I+II+III+IV);
	static float CGPA=(total/40f);
}
public class task2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detail n=new Detail();
		System.out.println("MY DETAIL :");
		System.out.println("My Name is "+n.Name+",My age is "+n.Age+",I'm from "+n.Location);
		CourseDetail z=new CourseDetail();
		System.out.println("I completed "+z.Coursename+" at "+z.Location);
		System.out.println("My total CGPA is "+Mark.CGPA);
		
	}

}
