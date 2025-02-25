package array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1},{1,2},{1,2,3}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
//This is Jagged Array