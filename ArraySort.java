package Day13;
import java.util.Arrays;
public class ArraySort {
	
	
    public int[] sort(int[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        Arrays.sort(array);
        return array;
    }
	public static void main(String[] args) {
		
		ArraySort as=new ArraySort();
		int b[]= {7,3,8,5,5,0};
		int result[]=as.sort(b);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}

}
