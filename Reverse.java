package Day13;

public class Reverse {
	

    public String reversestring(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(text).reverse().toString();
    }
	

	public static void main(String[] args) {
		
		
		Reverse r=new Reverse();
		System.out.println(r.reversestring(""));
	

	}

}
