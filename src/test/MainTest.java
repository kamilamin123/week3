package test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import main.Main;

class MainTest {
	
	

	@Test
	@DisplayName("test 1001 is palindrome")
	void testIsPalindrome() {
		assumeTrue(Main.isPalindrome(1001),"this to test 1001 is palindrome");
		
	}
	
	@Test
	@DisplayName("test 123 is palindrome")
	void testIsPalindrome1() {
		assumeFalse(Main.isPalindrome(123),"this to test 123 is not palindrome");
	}

	

	@Test
	@DisplayName("test -123 is palindrome")
	void testIsPalindrome3() {
		assumeFalse(Main.isPalindrome(123),"this to test -123 is not palindrome");
		
	}
	
	@Test
	@DisplayName("test -1001 is palindrome")
	void testIsPalindrome4() {
		assumeTrue(Main.isPalindrome(-1001),"this to test 1001 is palindrome");
	}

}
