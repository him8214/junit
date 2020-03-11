package com.niit.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
	MyMath math= new MyMath();
	
	/*private MyMath math;
	@Before
	 public void setup() throws Exception{
		 math = new MyMath();
	 }
	@After
	public void tearDown() throws Exception
	{ 
		math =null;
	}
	*/

	

	@Test
	public void testSum1() {
		System.out.println("Test 1");
		assertEquals(6,math.sum(new int[]{1,2,3}));
	}

	@Test
	public void testSum2() {
		System.out.println("Test 2");
		assertEquals(3,math.sum(new int[]{3}));
	}

}
