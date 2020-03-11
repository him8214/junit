package com.niit.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpTest {

	 

	
	@Test
	public void SimpleEqualstest() 
	{
     String expectedName= "himanshu";
     assertEquals(expectedName,Employee.getEmpNameOFhighestSalary());
	}
	
	@Test
	public void ObjectEqualstest() 
	{
    
		Employee empobj = new Employee(1,"himanshu",150000);
     assertEquals(empobj,Employee.getEmpNameOFhighestSalary());
	}

}
