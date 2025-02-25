package filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class fh1 {
public static void main(String[] args) throws IOException {
	File obj=new File("C:\\Users\\LENOVO\\Desktop\\Empty.txt");
	obj.createNewFile();
	Scanner sc= new Scanner(obj );
}
}
