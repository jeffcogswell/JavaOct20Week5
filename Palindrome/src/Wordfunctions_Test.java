import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Wordfunctions_Test {

	@Test
	void test() {
		boolean result = Wordfunctions.isPalindrome("hello");
		assertEquals(false, result);
	}
	
	@Test
	void test2() {
		boolean result = Wordfunctions.isPalindrome("abcba");
		assertEquals(true, result);
	}

	@Test
	void test3() {
		boolean result = Wordfunctions.isPalindrome("abba");
		assertEquals(true, result);
	}
	
	@Test
	void test4() {
		boolean result = Wordfunctions.isPalindrome("a1bb1a");
		assertEquals(true, result);
	}
	
}







