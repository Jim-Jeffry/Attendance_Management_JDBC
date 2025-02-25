package InnerClass;
public class AnonymousIC {
	void first() {
		System.out.println("This is Normal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousIC obj=new AnonymousIC();
		AnonymousIC obj1=new AnonymousIC(){
			void first() {
				System.out.println("This is Over Ride Annonymous Class");
			}
		};
		obj.first();
		obj1.first();
	}
}
//This is Annonymous Inner Class