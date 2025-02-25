package MultiTasking;
class ThrdSyn1{
	synchronized void odd(int n)
	{
		for(int i=n;i<=100;i++)
		{ System.out.println(i);
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("********************************");
	}
}
public class OddEven extends Thread{
	ThrdSyn1 ob;
	int n;
	public OddEven(ThrdSyn1 ob, int n) {
		this.ob=ob;
		this.n=n;
	}
	public void run()
	{
		ob.odd(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrdSyn1 ob = new ThrdSyn1();
		OddEven s=new OddEven(ob,1);
		OddEven s1=new OddEven(ob,2);
		s.start();
		s1.start();
	}
}