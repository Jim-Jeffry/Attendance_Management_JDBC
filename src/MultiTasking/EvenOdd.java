package MultiTasking;
class ev{
	synchronized void ev1(int e) {
		for(int i=e;i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			}
			catch(Exception x) {
				
			}
			i++;
		}
		System.out.println("**************************");
	}
}
public class EvenOdd extends Thread{
	ev ob;
	int e;

	public EvenOdd(ev ob,int e) {
		// TODO Auto-generated constructor stub
		this.ob=ob;
		this.e=e;
	}
	public void run()
	{
		ob.ev1(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ev ob=new ev();
		EvenOdd s1=new EvenOdd(ob,1);
		EvenOdd s2=new EvenOdd(ob,2);
		s1.start();
		s2.start();
	}

}
