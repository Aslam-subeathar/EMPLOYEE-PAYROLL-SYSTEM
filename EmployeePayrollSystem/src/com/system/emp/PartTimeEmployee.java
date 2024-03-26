package com.system.emp;

public class PartTimeEmployee extends Employee {
	private int hourseWork;
	private double hourlyRate;
	
	public PartTimeEmployee(String name,int id,int hoursWork,double hourlyRate){
		super(name,id);
		this.hourseWork = hourseWork;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public double calculateSalary(){
		return hourseWork*hourlyRate;
		
	}

}
