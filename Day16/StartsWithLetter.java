package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class FirstLetter { 
    private String word;

    public FirstLetter(String word) { 
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) { 
        this.word = word;
    }

    @Override
    public String toString() {
        return word; 
    }
}

public class StartsWithLetter {

    public static void main(String[] args) {
        List<FirstLetter> words = new ArrayList<>(); 

        words.add(new FirstLetter("Apple"));
        words.add(new FirstLetter("Banana"));
        words.add(new FirstLetter("Avocado")); 
        words.add(new FirstLetter("Cherry"));

        printWords(words, w -> w.getWord().charAt(0) == 'A'); 
    }

    public static void printWords(List<FirstLetter> words, Predicate<FirstLetter> predicate) { 
        for (FirstLetter word : words) { 
            if (predicate.test(word)) {
                System.out.println(word);
            }
        }
    }
}
