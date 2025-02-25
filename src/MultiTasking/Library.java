package MultiTasking;
import java.util.Scanner;
public class Library {
	 Scanner sc=new Scanner(System.in);
	 String MECH[]=new String[10];
	 String ECE []=new String[10];
	 String EEE []=new String[10];
	 String CSE []=new String[10];
//	 static	int mechCount = 0; 
//	    int eceCount  = 0;
//	    int eeeCount  = 0;
//	    int cseCount  = 0;
	 void books() {
		 MECH[0]="Mechatronics";
		 MECH[1]="EngineeringDrawing";
		 MECH[2]="ThermoDynamics";
		 MECH[3]="FluidMechanics";
		// mechCount=4;
		 ECE [0]="OpticalCommunication";
		 ECE [1]="AntennaAndWavePropogation";
		 ECE [2]="WirelessCommunication";
		 ECE [3]="RadarCommunication";
		// eceCount=4;
		 EEE [0]="PowerElectronics";
		 EEE [1]="AnalogElectronics";
		 EEE [2]="ElectricalCircuits";
		 EEE [3]="ElectronicInstrumentation";
		// eeeCount=4;
		 CSE [0]="Java";
		 CSE [1]="Python";
		 CSE [2]="OperatingSysytem";
		 CSE [3]="ManagementPrinciple";
		// cseCount=4;
	 }
	 void displayAllBooks() {
	        System.out.println("All Available Books:");
//	        displayBooks(MECH);
//	        displayBooks(ECE);
//	        displayBooks(EEE);
//	        displayBooks(CSE);
	   //     System.out.println(mechCoun);
	        for(int i=0;i<MECH.length;i++) {
	        	System.out.println("abc");
	        	if(MECH[i]!=null) {
	        		System.out.println(MECH[i]);
	        	}
	        }
	        for(int i=0;i<CSE.length;i++) {
	        	if(CSE[i]!=null) {
	        		System.out.println(CSE[i]);
	        	}
	        }
	        for(int i=0;i<EEE.length;i++) {
	        	if(EEE[i]!=null) {
	        		System.out.println(EEE[i]);
	        	}
	        }
	        for(int i=0;i<ECE.length;i++) {
	        	if(ECE[i]!=null) {
	        		System.out.println(ECE[i]);
	        	}
	        }
	    }
	 void displayBooks(String[] books) {
		 for(String book:books) {
			 if(book!=null) {
				 System.out.println(book);
			 }
		 }
	 }
	void tb(){
		System.out.println("Which dept Book you want to Take");
		System.out.println("MECH   CSE   EEE   ECE");
		String bb=sc.next().toUpperCase();
		if(bb.equals("MECH")) {
			displayBooks(MECH);
		}
		else if(bb.equals("CSE")) {
			displayBooks(CSE);
		}
		else if(bb.equals("EEE")) {
			displayBooks(EEE);
		}
		else if(bb.equals("ECE")) {
			displayBooks(ECE);
		}
		else {
			System.out.println("Invalid Department");
		}
	}
	void rb(){
		System.out.println("Which dept Book you want to Take");
		System.out.println("MECH   CSE   EEE   ECE");
	}
	void student() {
		System.out.println("What Should you want to do (Take-Book/Return-Book)");
		String st=sc.next();
		if(st.equals("Take-Book")) {
			tb();
		}
		else if(st.equals("Return-Book")){
			rb();
		}
		else {
            System.out.println("Invalid option.");
        }
	}
	void addbook() {
		System.out.println("For Which Dept you like to add an New Book (MECH   CSE   EEE   ECE)");
		String ab=sc.next();
		if(ab.equals("MECH")) {
			if (mechCount < MECH.length) {
            System.out.println("Enter the name of the book to add:");
            String newBook = sc.next();
            MECH[mechCount] = newBook;
            System.out.println("Book added successfully.");
            mechCount++;
            displayBooks(MECH);
        } else {
            System.out.println("No space to add more books.");
        }
		}
		else if(ab.equals("CSE")) {
			if (cseCount < CSE.length) {
	            System.out.println("Enter the name of the book to add:");
	            String newBook = sc.next();
	            CSE[cseCount] = newBook;
	            System.out.println("Book added successfully.");
	            cseCount++;
	            displayBooks(CSE);
	        } else {
	            System.out.println("No space to add more books.");
	        }
		}
		else if(ab.equals("EEE")) {
			if (eeeCount < EEE.length) {
	            System.out.println("Enter the name of the book to add:");
	            String newBook = sc.next();
	            EEE[eeeCount] = newBook;
	            System.out.println("Book added successfully.");
	            eeeCount++;
	            displayBooks(EEE);
	        } else {
	            System.out.println("No space to add more books.");
	        }
		}
		else if(ab.equals("ECE")) {
			if (eceCount < ECE.length) {
	            System.out.println("Enter the name of the book to add:");
	            String newBook = sc.next();
	            ECE[eceCount] = newBook;
	            System.out.println("Book added successfully.");
	            eceCount++;
	            displayBooks(ECE);
	        } else {
	            System.out.println("No space to add more books.");
	        }
		}
		staff();
	}
	void staff() {
		System.out.println("What Should you want to do (Add-Book/View-Book)");
		String st=sc.next();
		if(st.equals("Add-Book")) {
			addbook();
		}
		else if(st.equals("View-Book")){
			displayAllBooks();
		}
		else {
            System.out.println("Invalid option.");
        }
	}
	void common() {
		System.out.println("Welcome User");
		System.out.println("Who is this (Student/Staff)");
		String use=sc.next();
		if(use.equals("Student")) {
			System.out.println("Welcome student user");
			student();
		}
		else if(use.equals("Staff")) {
			System.out.println("Welcome Staff user");
			staff();
		}
		else {
            System.out.println("Invalid user type.");
        }
	}
	public static void main(String[] args) {
		Library obj=new Library();
		obj.common();
	}
}