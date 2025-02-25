package MultiTasking;
	class ThrdSyn
	{
		synchronized void invite(String name)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print("welcome ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}
	}
	public class Synch extends Thread{
		ThrdSyn obj;
		String name;
		Synch(ThrdSyn obj,String name)
		{
			this.obj=obj;
			this.name=name;
		}
		public void run()
		{
			obj.invite(name);
		}
		public static void main(String[] args) {
			ThrdSyn t=new ThrdSyn();
			Synch s=new Synch(t,"sir");
			Synch s1=new Synch(t,"mam");
			Synch s2=new Synch(t,"you all");
			Synch s3=new Synch(t,"every one");
			s.start();
			s1.start();
			s2.start();
			s3.start();
		}
	}