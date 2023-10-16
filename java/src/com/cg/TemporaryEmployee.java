package com.cg;

  class  TemporaryEmployee extends Employee {
	int calculateSalaryHike;
	public TemporaryEmployee (String designation, Integer hikePercent) {
	
		//private String designation;
		//private Integer HikePercent;
		super(designation, hikePercent);
		this.calculateSalaryHike=calculateSalaryHike;
 }	
  }
	@Override 
	public void calculateSalaryHike() {
		super.calculateSalaryHike();
		System.out.println("CalculateSalaryHike: " + CalculateSalaryHike);
	}

	 
 

