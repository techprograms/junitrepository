package com.srdt.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		boolean test = todos.contains("AWS");
		boolean test2 = todos.contains("GCP");
		assertEquals(true, test);
		assertEquals(3, todos.size());
		
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
		assertTrue(test);
		assertFalse(test2);
	}

}
