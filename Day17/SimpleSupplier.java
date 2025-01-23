package Day17;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SimpleSupplier {
    public static void CallSupplier()
    {

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
    public static void main(String[] args) {
        SimpleSupplier sm = new SimpleSupplier();
        CallSupplier();
    }
}
