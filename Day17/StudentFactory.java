package Day17;

@FunctionalInterface
public interface StudentFactory {
    public Students create(String name,int marks);
}
