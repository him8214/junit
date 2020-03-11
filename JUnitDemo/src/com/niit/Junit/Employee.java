package com.niit.Junit;

public class Employee 
{
   private int empId;
   private String name;
   private int salary;

   public Employee(int empId, String name, int salary) 
    {
	 super();
	 this.empId = empId;
	 this.name = name;
	 this.salary = salary;
    }
   public int getEmpId() 
      {
	    return empId;
      }
   public void setEmpId(int empId) 
      {
	    this.empId = empId;
      }
   public String getName() 
      {
	    return name;
      }
   public void setName(String name) 
     {
	   this.name = name;
     }
   public int getSalary() 
     {
	   return salary;
     }
   public void setSalary(int salary) 
     {
	   this.salary = salary;
     }
   public static String getEmpNameOFhighestSalary()
     {
	   return "himanshu";
     }
   public static Employee getHighestPaidEmployee()
     {
	   return new Employee(1,"himanshu",150000);
     }
@Override
public int hashCode() {
/*	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;   */
	return this.empId;
}
@Override
public boolean equals(Object obj) 
 {
	if (this == obj)
		return true;
	
	if (obj == null)
		return false;
	
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	
	if (empId != other.empId)
		return false;
	
	if (name == null) 
	   {
		if (other.name != null)
			return false;
	   }
	else if (!name.equals(other.name))
		return false;
 
	if (salary != other.salary)
		return false;
	    return true;
 }
   
}
