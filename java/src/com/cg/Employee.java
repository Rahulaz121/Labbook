package com.cg;

public class Employee {
	private Integer EmpId;
	private String empName;
	private Double baseSalary;
	
	public Employee(Integer EmpId, String name, Double baseSalary) {
		this.EmpId= EmpId;
		this.empName= empName;
		this.baseSalary=baseSalary;
	}
	public void Employee() {
		System.out.println("EmpId:" + EmpId);
		System.out.println("empName:" + empName);
		System.out.println("baseSalary:" + baseSalary);
	}
}
	
