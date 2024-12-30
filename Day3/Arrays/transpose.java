package day3p;

public class transpose {

	public static void main(String[] args) {
		
		int a[][]= {
				{3,4,2,1},
				{6,1,7,8},
				{6,5,4,3}
		};
	//row =3 coloumn=4
		
		for(int i=0;i<a[0].length;i++) {                          //i=0 j=0   0 , 0 ,
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+a[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
