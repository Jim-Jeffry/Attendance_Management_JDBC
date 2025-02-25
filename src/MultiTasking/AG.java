package MultiTasking;

public class AG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		int b=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][0]==a[0][j]&&a[i][1]==a[1][j]&&a[i][2]==a[2][j]) {
					b++;
				}
			}
		}
		System.out.println(b);
		int c[]= {1,2,3,4};
		System.out.println(c);
	}

}
