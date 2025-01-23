package Day17;

public class MethodReferenceConstructor {
    public static void main(String[] args) {
           StudentFactory factory = Students::new;
           Students stu = factory.create("Manoj",80);
    }
}
