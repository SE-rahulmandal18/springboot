package com.simpli.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.function.Executable;

@TestInstance(Lifecycle.PER_CLASS) // @BeforeAll, @AfterAll- > for non static class we need to define
class MathUtilsTest {

	MathUtil mathUtil;
	
	@BeforeAll
	public void initAll() {
		
		System.out.println("Before all test case");
	}
	
	@AfterAll
	public  void initAfterAll() {
		
		System.out.println("After all test case");
	}
	
	@BeforeEach
	public void init() {
		
		mathUtil =  new MathUtil();
	}
	
	@AfterEach
	public void cleanup() {
		
		System.out.println("After each test case");
	}
	
	@Test
	@DisplayName("AdditiontTest")
	void addTest() {
		
//		MathUtil mathUtil =  new MathUtil();
		
		
		int actual = mathUtil.add(2, 2);
		int expected = 4;
		
		assertEquals(expected, actual);
	}
       
	@Test
	@Disabled
	void divideTest() {
		
//		MathUtil mathUtil =  new MathUtil();
	
		Executable executable = () -> mathUtil.divide(7, 0);
		
		assertThrows(ArithmeticException.class, executable);
	}
	
	@Test
	void maxNumberTset() {
		
//		MathUtil mathUtil =  new MathUtil();
		
//		assertEquals(-1, mathUtil.findMax(new int[] {-3, -2, -7, -10, -1}), "This test returns max of array");
		
		assertAll(
				
				() -> assertEquals(-1, mathUtil.findMax(new int[] {-3, -2, -7, -10, -1}), "This test returns max element of array"),
				() -> assertEquals(10, mathUtil.findMax(new int[] {3, 2, 7, 10, 1}), "This test returns max of array")
				
				
				);
		
	}
}
