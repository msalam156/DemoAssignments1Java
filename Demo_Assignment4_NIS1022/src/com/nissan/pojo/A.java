<<<<<<< HEAD
package com.nissan.pojo;

public class A extends Bank {

	public A() {}
	
	public A(double principleAmount, double time) {
		super(principleAmount, time);
		super.setInterestRate(10);
	}
	
	@Override
	public double getInterest() {
		return super.getPrincipleAmount() * super.getInterestRate() * super.getTime() / 100;
	}

}
=======
package com.nissan.pojo;

public class A extends Bank {

	public A() {}
	
	public A(double principleAmount, double time) {
		super(principleAmount, time);
		super.setInterestRate(10);
	}
	
	@Override
	public double getInterest() {
		return super.getPrincipleAmount() * super.getInterestRate() * super.getTime() / 100;
	}

}
>>>>>>> 03d97f925cf584da65fa9cf807019b741437dbdd
