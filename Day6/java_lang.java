package day6;

	
	class MyClass {
	    private String message;

	    public MyClass(String message) {
	        this.message = message;
	    }

	    @Override
	    public String toString() {
	        return "MyClass [message=" + message + "]";
	    }
	}

	public class java_lang {
	    public static void main(String[] args) {
	        MyClass myObject = new MyClass("Hello, Object Class!");
	        System.out.println("Class of the object: " + myObject.getClass());
	        System.out.println("String representation of the object: " + myObject.toString());
	    }
	}


