package Day17;

import javax.crypto.spec.PSource;
import java.util.Optional;

public class HandlingNullwithOptional {
    public static void main(String[] args) {
        String name[] = {"Kavin",null,"Kumar"};
        for (String str : name)
        {
            Optional<String> optional = Optional.ofNullable(str);
            if(optional.isPresent())
            {
                System.out.println(optional.get());
            }
            else
            {
                System.out.println("Empty Input");
            }
        }

    }
}
