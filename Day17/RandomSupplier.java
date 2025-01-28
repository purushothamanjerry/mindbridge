package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {
        int i=1;
        Random random = new Random();
        Supplier<Integer> supplier = ()-> random.nextInt(100);
        for (int j=0;j<5;j++)
        {
            System.out.println("Random Number "+i+" : "+supplier.get()  );
            i++;
        }

    }
}
