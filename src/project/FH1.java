package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FH1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\LENOVO\\Desktop\\File_Handling\\one\\two\\three");
		f.mkdir();
		f.mkdirs();
		
		System.out.println(f.canWrite());
		String s="khvuwgvu";
		FileWriter fw=new FileWriter("C:\\Users\\LENOVO\\Desktop\\File_Handling\\filehandling.txt");
		fw.write(s);
		fw.flush();
	}

}
