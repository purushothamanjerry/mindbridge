package Day13;

public class Palindrome {



    public boolean isPalindrome(String input) throws IllegalArgumentException {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Palindrome checker = new Palindrome();
        try {
            System.out.println(checker.isPalindrome("Purushothaman") ? "It's a palindrome" : "It's not a palindrome");
            System.out.println(checker.isPalindrome("Mom") ? "It's a palindrome" : "It's not a palindrome");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

