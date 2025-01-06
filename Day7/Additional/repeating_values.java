package day7.additionals;

public class repeating_values {

    public static int maxRepeating(String sequence, String word) {
        int k = 0; 
        String repeatedWord = word; 
        
        while (sequence.contains(repeatedWord)) {
            k++;
            repeatedWord += word; 
            }
        
        return k;
    }

    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word)); 
    }
}
