package MultiTasking;
import java.util.Scanner;
public class AddNewStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String MECH[]= {"Mechatronics","EngineeringDrawing","ThermoDynamics","FluidMechanics"};
		System.out.println("The Current Subjects");
		for(int i=0;i<MECH.length;i++) {
			System.out.println(MECH[i]);
		}
		System.out.println("Enter the Subject You Want to Add");
		String NewSub=sc.next();
		int indextoadd=1;
		String newArray[]=new String[MECH.length+1];
		for(int i=0,j=0;i<newArray.length;i++) {
			if(i==indextoadd) {
				newArray[i]=NewSub;
			}
			else {
				newArray[i]=MECH[j];
				j++;
			}
		}
		for (String subject : newArray) {
            System.out.println(subject);
        }
	}

}
