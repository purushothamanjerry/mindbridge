package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsingOptionalwithDefaultValues {
    public static void DefaultValue(List<String> str)
    {
        for (String name : str)
        {
            Optional<String> optional =Optional.ofNullable(name);
            System.out.println(optional.orElse("Guest"));
        }

    }
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Kavin");
        str.add(null);
       DefaultValue(str);
    }
}
