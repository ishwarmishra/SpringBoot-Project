package testingWithJunit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnit5 {

	@BeforeAll
	static void before() {
		System.out.println("before all");
	}
	
	@AfterAll
	static void after() {
		System.out.println("after all");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each");
	}
	@AfterEach
	void afterEach() {
		System.out.println("After each");
	}
	
	@Test
	void testC() {
		System.out.println("test C");
	}


	@Test
	void testA() {
		System.out.println("test A");
		Calculator calc=new Calculator();
		assertEquals(calc.add(2,2),4);
	}

	@Test
	void testB() {
		System.out.println("test B");
	}

}