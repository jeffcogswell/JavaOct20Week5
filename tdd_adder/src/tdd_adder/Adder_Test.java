package tdd_adder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Adder_Test {
	
	/*
	 * TESTS
	 * 
	 *   1. Try adding 10, 20 -> 30
	 *   2. Try adding 10, -5 -> 5
	 *   3. Try adding 0, 0 -> 0
	 *   4. Try adding 5, -10 -> 0
	 */

	@Test
	void test() {
		int result = Adder.add(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	void test2() {
		int result = Adder.add(10, -5);
		assertEquals(5, result);
	}
	
	@Test
	void test3() {
		int result = Adder.add(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	void test4() {
		int result = Adder.add(5, -10);
		assertEquals(0, result);
	}

}
