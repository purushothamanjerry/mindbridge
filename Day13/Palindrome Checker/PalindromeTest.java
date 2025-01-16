package test1;

	

	import org.junit.Assert;
	import org.junit.Test;
	import Day13.Palindrome;

	public class PalindromeTest {

	    @Test(expected = IllegalArgumentException.class)
	    public void testNullInput() {
	        Palindrome checker = new Palindrome();
	        checker.isPalindrome(null); 
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testEmptyInput() {
	        Palindrome checker = new Palindrome();
	        checker.isPalindrome(""); 
	    }

	    @Test
	    public void testValidPalindrome() {
	        Palindrome checker = new Palindrome();
	        boolean result = checker.isPalindrome("madam");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void testPalindromeWithCaseSensitivity() {
	        Palindrome checker = new Palindrome();
	        boolean result = checker.isPalindrome("Madam");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void testValidPalindromeWithSpaces() {
	        Palindrome checker = new Palindrome();
	        boolean result = checker.isPalindrome("A man a plan a canal Panama".replaceAll("\\s+", ""));
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void testNonPalindrome() {
	        Palindrome checker = new Palindrome();
	        boolean result = checker.isPalindrome("hello");
	        Assert.assertFalse(result);
	    }


	}



