package Day11;

public class GenericsBox <T>{

		private T item;
		public void setItem(T item) {
	        this.item = item;
	    }
		
		 public T getItem() {
		        return item;
		    }
		    public void printItem() {
		        System.out.println(item);
		    }

		    public boolean isTypeOf(Object item) {
		        return item instanceof String;
		    }
		
		public static void main(String[] args) {
			   GenericsBox<String> stringBox = new GenericsBox<>();
		        stringBox.setItem("Hello");
		        System.out.println("Hello world " + stringBox.isTypeOf(stringBox.getItem()));
		        System.out.println("Hell the new World? " + stringBox.isTypeOf(Integer.class));
 }
		}

	


