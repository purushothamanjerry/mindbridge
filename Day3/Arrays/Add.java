package day3p;

public class Add {
	
	
	public static void main(String[] args) {
		
	
	
	int a[][]= {
			    {3,2,1,4},
			    {6,1,5,7},
			    {4,1,7,2}
			    };
	int b[][]= {
		    {7,4,6,8},
		    {2,4,9,3},
		    {4,1,1,12}
		    };
	
	int c[][]=new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c[i].length;j++) {
			System.out.print(c[i][j]+" ");
		}
		
		System.out.println();
	}
	//System.out.println(a[0].length);
	//System.out.println(a.length);
	/*
	{	10  6  7  12
	8   5  14  10
	8   2  8   14
	}*/
	
	}
}
