package com.niit.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	@Before
	 public void setup() throws Exception{
		 calc = new Calculator();
	 }
	@After
	public void tearDown() throws Exception
	{ 
		calc =null;
	}
	

	@Test
	public void testAdd() 
	{
		double result = calc.add(100, 10);
		assertEquals(110,result,0.001);
	}
	@Test
	public void testSubtract() 
	{
		double result = calc.subtract(100, 10);
		assertEquals(90,result,0.001);
	}
	@Test
	public void testDivide() 
	{
		double result = calc.divide(100, 10);
		assertEquals(10,result,0.001);
	}
	@Test
	public void testMultiply() 
	{
		double result = calc.multiply(2.5, 100);
		assertEquals(250,result,0.001);
	}

}
