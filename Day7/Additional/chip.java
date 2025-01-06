package day7.additionals;

public class chip {

	    public static int minCost(int[] position) {
	        int evenCount = 0, oddCount = 0;

	        for (int i : position) {
	            if (i % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        return Math.min(evenCount, oddCount);
	    }

	    public static void main(String[] args) {
	        int[] position1 = {1, 2, 3};
	        System.out.println(minCost(position1)); 	    }

		}

	

