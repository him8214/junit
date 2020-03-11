package com.niit.Junit;

public class Calculator 
{ 
	
	public static double add(double a, double b)
  {
	  return a+b;
  }
  
   public static double subtract(double a, double b)
  {
	  return a-b;
  }
   public static double divide(double a, double b)
   {
 	  if (b==0)
 		  {
 		  throw new ArithmeticException();
 		  }
 	  return a/b;
   }
   public static double multiply(double a, double b)
   {
 	  return a*b;
   }

public static void main(String[] args)
   {
	System.out.println(add(1, 110));
	System.out.println(subtract(100, 10));
	System.out.println(divide(220, 110));
	System.out.println(multiply(13245, 110));
   }
}