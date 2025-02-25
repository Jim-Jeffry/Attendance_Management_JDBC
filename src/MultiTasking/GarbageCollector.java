package MultiTasking;
public class GarbageCollector {
//	int a=100;
//	void demo()
//	{
//		GarbageCollector obj=new GarbageCollector();
//	}
//	public void finalize()
//	{
//		System.out.println("calling garbage collector......");
//	}
//	
//public static void main(String[] args) {
//	GarbageCollector obj=new GarbageCollector();
//	
//	//obj=null;
//	GarbageCollector ob=new GarbageCollector();
//	//ob=obj;
//	//new finlz(); 
//	System.out.println(ob.a);
//	System.out.println(obj.a);
//	ob.demo();
//    System.gc();
//    
//}
	int a=100;
	void meth() {
		GarbageCollector ob=new GarbageCollector();
	}
	public void finalize()
	{
		System.out.println("calling garbage collector......");
	}
	public static void main(String[] args) {
		GarbageCollector ob=new GarbageCollector();
		System.out.println(ob.a);
		ob.meth();
		System.gc();
	}
}
