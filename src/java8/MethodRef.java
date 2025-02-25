package java8;
import java.util.function.Predicate;

@FunctionalInterface
interface Sample1
{
 void demo();
}

public class MethodRef {

 MethodRef()
 {
  System.out.println("Constructor reference");
 }
 void methodOne()
 {
  System.out.println("instance method reference");
 }
	
 static int methodTwo()
 {
  System.out.println("static method reference");
  return 0;
 }
	
 boolean methodThree(int a)
 {
  return a>20;
 }
 public static void main(String[] args) {
  // TODO Auto-generated method stub

  MethodRef obj =new MethodRef();
  Sample1 ob= obj :: methodOne ;
  ob.demo();
  
  Sample1 s = MethodRef :: methodTwo ;
  s.demo();
  
  Sample1 s2 =MethodRef :: new ;
  s2.demo();
  
  Predicate<Integer> e=obj :: methodThree;
  System.out.println(e.test(30));
 }

}
