package com.nissan.dean;

public class Employee {
	
	// Instace variable
		private String name;
		private String company;
		private double salary;
		
		// constructor
		Employee(String name,double salary) {
			this.name = name;
			this.salary = salary;
		}
		
		// all Getter and Setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + " "+ ", salary=" + salary + "]";
		}
		
		// Override ToString
		
}