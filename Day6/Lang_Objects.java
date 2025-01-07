package day6;

class MyClass {
    private String name;
    private int regno;

    public MyClass(String name, int regno) {
        this.name = name;
        this.regno = regno;
    }

    @Override
    public String toString() {
        return "[Name=" + name + ", Regno=" + regno + "]";
    }
}

public class Java_Lang {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Purushothaman", 7316211);
        
        System.out.println("Class of the object: " + myObject.getClass());
        System.out.println(myObject.toString());
    }
}
