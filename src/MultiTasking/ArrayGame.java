package MultiTasking;
class arr{
	int[][] ar= {{3,2,1},{1,7,6},{2,7,7}};
	int[][] clm=new int[100][100];
	int row[][]=new int[100][100];
	int r;
	void ar(){
		for(int w=0;w<ar.length;w++) {
			for(int i=0;i<1;i++) {
				for(int j=0;j<ar.length;j++) {
					clm[i][j]=ar[i][j];
				}
			}
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<1;j++) {
					row[i][j]=ar[i][j];
					if(clm[i][j]==row[i][j]) {
						r++;	
						}
				}
				
			}
		} 
		System.out.println(r);
		
	}
	
}
public class ArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr obj=new arr();
		obj.ar();
	}

}
