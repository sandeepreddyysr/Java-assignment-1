package omniwyse.SandeepReddy1;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is used to check the given string is palindrome or not. Time Complexity
 * : O(N ^2)
 * 
 * @author Sandeep Reddy
 *
 */

public class TestStringPalindrome {

	@Test
	public void palindromeCheck() {
		Assert.assertEquals(true, StringPalindrome.isPalindrome("amma".toUpperCase()));
	}

	@Test
	public void isNotPalindromeCheck() {
		Assert.assertEquals(false, StringPalindrome.isPalindrome("nanna".toUpperCase()));
	}

}