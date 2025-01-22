package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Numbers {
    private int num;

    public Numbers(int num) {
        this.num = num;
    }

    public int getNum() {
    	
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Numbers> digits = new ArrayList<>();

        digits.add(new Numbers(12));
        digits.add(new Numbers(45));
        digits.add(new Numbers(22));
        digits.add(new Numbers(35));
        digits.add(new Numbers(60));

     printNumbers(digits, n -> n.getNum() % 2 == 0);
    
    }

    public static void printNumbers(List<Numbers> digits, Predicate<Numbers> predicate) {
        for (Numbers num : digits) {
            if (predicate.test(num)) {
                System.out.println(num);
            }
        }
    }
}
