package MultiTasking;

public class task1 {
final  int a;
  task1(){
	a=100;
   }
  task1(int a){
	this.a=a;
  }
	public static void main(String[] args) {
		task1 t1=new task1(30);
		task1 t2=new task1(40);
		task1 t3=new task1(400);
	}
	void m1() {
		System.out.println(a);
	}

}
