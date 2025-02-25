package MultiTasking;
import java.util.*;
public class NewLib {
	 Scanner sc=new Scanner(System.in);
	 String MECH[]= {"Mechatronics","EngineeringDrawing","ThermoDynamics","FluidMechanics"};
	 String ECE[] = {"OpticalCommunication","AntennaAndWavePropogation","WirelessCommunication","RadarCommunication"};
	 String EEE[] = {"PowerElectronics","AnalogElectronics","ElectricalCircuits","ElectronicInstrumentation"};
	 String CSE[] = {"Java","Python","OperatingSysytem","ManagementPrinciple"};
	 void books() {
		 MECH[0]="Mechatronics";
		 MECH[1]="EngineeringDrawing";
		 MECH[2]="ThermoDynamics";
		 MECH[3]="FluidMechanics";
		 ECE [0]="OpticalCommunication";
		 ECE [1]="AntennaAndWavePropogation";
		 ECE [2]="WirelessCommunication";
		 ECE [3]="RadarCommunication";
		 EEE [0]="PowerElectronics";
		 EEE [1]="AnalogElectronics";
		 EEE [2]="ElectricalCircuits";
		 EEE [3]="ElectronicInstrumentation";
		 CSE [0]="Java";
		 CSE [1]="Python";
		 CSE [2]="OperatingSysytem";
		 CSE [3]="ManagementPrinciple";
	 }
	 void start() {
		 System.out.println("Welcome (Student/Staff)");
		 String st=sc.next();
		 if(st.equals("Student")) {
			 Student();
		 }
		 else if(st.equals("Staff")){
			 Staff();
		 }
		 else {
			 System.out.println("Invalid User");
		 }
	 }
	 void Student() {
		 System.out.println("Welcome User Student");
		 System.out.println("(Take-Book/Return-Book)");
		 String st=sc.next();
		 if(st.equals("Take-Book")) {
			 
		 }
		 else if(st.equals("Return-Book")) {
			 
		 }
		 else {
			 System.out.println("Invalid Option");
		 }
	 }
	 void Staff() {
		 System.out.println("Welcome User Staff");
		 System.out.println("(Add-Book/View-Book)");
		 String st=sc.next();
		 if(st.equals("Add-Book")) {
			 addbook();
		 }
		 else if(st.equals("View-Book")) {
			 view();
		 }
		 else {
			 System.out.println("Invalid Option");
		 }
	 }
	 void addbook() {
		 System.out.println("For Which Department You want to Add Books");
		 System.out.println("MECH   CSE   EEE   ECE");
		 String st=sc.next();
			System.out.println("Enter the Subject You Want to Add");
			String NewSub=sc.next();
			int indextoadd=1;
			if(st.equals("MECH")) {
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
			if(st.equals("CSE")) {
				String newArray[]=new String[CSE.length+1];
				for(int i=0,j=0;i<newArray.length;i++) {
					if(i==indextoadd) {
						newArray[i]=NewSub;
					}
					else {
						newArray[i]=CSE[j];
						j++;
					}
				}
				for (String subject : newArray) {
		            System.out.println(subject);
		        }
			}
			if(st.equals("EEE")) {
				String newArray[]=new String[EEE.length+1];
				for(int i=0,j=0;i<newArray.length;i++) {
					if(i==indextoadd) {
						newArray[i]=NewSub;
					}
					else {
						newArray[i]=EEE[j];
						j++;
					}
				}
				for (String subject : newArray) {
		            System.out.println(subject);
		        }
			}
			if(st.equals("ECE")) {
				String newArray[]=new String[ECE.length+1];
				for(int i=0,j=0;i<newArray.length;i++) {
					if(i==indextoadd) {
						newArray[i]=NewSub;
					}
					else {
						newArray[i]=ECE[j];
						j++;
					}
				}
				for (String subject : newArray) {
		            System.out.println(subject);
		        }
			}
			System.out.println();
			Staff();
	 }
	 void view() {
		 System.out.println("For Which Department You want to view Books");
		 System.out.println("MECH   CSE   EEE   ECE   ALL");
		 String st=sc.next();
		 if(st.equals("MECH")) {
			 System.err.println("Books in MECH");
			 for(int i=0;i<MECH.length;i++) {
				 System.out.println(MECH[i]);
			 }
		 }
		 else if(st.equals("CSE")) {
			 System.err.println("Books in CSE");
			 for(int i=0;i<CSE.length;i++) {
				 System.out.println(CSE[i]);
			 }
		 }
		 else if(st.equals("EEE")) {
			 System.err.println("Books in EEE");
			 for(int i=0;i<EEE.length;i++) {
				 System.out.println(EEE[i]);
			 }
		 }
		 else if(st.equals("ECE")) {
			 System.err.println("Books in ECE");
			 for(int i=0;i<ECE.length;i++) {
				 System.out.println(ECE[i]);
			 }
		 }
		 else if(st.equals("ALL")) {
			 System.err.println("Books in MECH");
			 for(int i=0;i<MECH.length;i++) {
				 System.out.println(MECH[i]);
			 }
			 System.err.println("Books in CSE");
			 for(int i=0;i<CSE.length;i++) {
				 System.out.println(CSE[i]);
			 }
			 System.err.println("Books in EEE");
			 for(int i=0;i<EEE.length;i++) {
				 System.out.println(EEE[i]);
			 }
			 System.err.println("Books in ECE");
			 for(int i=0;i<ECE.length;i++) {
				 System.out.println(ECE[i]);
			 }
			 
		 }
		 else {
			 System.out.println("Invalid Option");
		 }
		 System.out.println();
		 Staff();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewLib obj=new NewLib();
		obj.start();
	}
}
