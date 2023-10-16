package com.cg;
 class PermanentEmployee extends Employee 
 {
	private String designation;
	private Integer HikePercent;
	
	public PermanentEmployee (int EmpId, String empName, double baseSalary, String designation, Integer hikePercent)
	{
		super();
		this.designation = designation;
		this.hikePercent= hikePercent;
	}
	@Override
	public void calculateSalaryHike() {
		super.calculateSalaryHike();
		System.out.println("calculateSalaryHike:" + calculateSalaryHike);
	}
}
