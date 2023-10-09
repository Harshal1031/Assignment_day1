package com.oops3;

public class TestEmp {

	public static void main(String[] args) {
       Employees e1= new Employees(1001, "Harshal");
       
       Employees e2= new Employees(1002, "Shubham");
         Employees.swap(e1, e2);
         System.out.println(e1.toString());
         System.out.println(e2.toString());


	}

}
