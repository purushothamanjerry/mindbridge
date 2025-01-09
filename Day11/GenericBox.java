package Day11;

public class GenericBox<T> {

   private T item;

	    public T getItem() {
	        return item;
	    }

	    public void setItem(T item) {
	        this.item = item;
	    }

	    public void printItem() {
	        System.out.println(item);
	    }

	    public boolean isTypeOf(Object item) {
	        return item instanceof String;
	    }

	    public static void main(String[] args) {
	        GenericBox<String> stringBox = new GenericBox<>();
	        stringBox.setItem("Hello");
	        System.out.println("Is the item of type String? " + stringBox.isTypeOf(stringBox.getItem()));
	        System.out.println("Is the item of type Integer? " + stringBox.isTypeOf(new Integer(42)));
	    }
	}
	


