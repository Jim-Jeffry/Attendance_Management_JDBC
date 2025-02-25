package MultiTasking;

public class AnnonymousIC {
	void first() {
		System.out.println("This is Normal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousIC obj=new AnnonymousIC();
		AnnonymousIC obj1=new AnnonymousIC(){
			void first() {
				System.out.println("This is Over Ride Annonymous Class");
			}
		};
		obj.first();
		obj1.first();
	}

}
//This is Annonymous Inner Class