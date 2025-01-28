package day7.additionals;

public class biker {
	
	
	    public static int highestaltitude(int[] gain) {
	        int current = 0;
	        int maxAltitude = 0;

	        for (int i: gain) {
	            current += i;  
	            maxAltitude = Math.max(maxAltitude, current);  
	        }

	        return maxAltitude;
	    }

	    public static void main(String[] args) {
	        int[] gain1 = {-5, 1, 5, 0, -7};
	        System.out.println(highestaltitude(gain1));  
	    }
	}


