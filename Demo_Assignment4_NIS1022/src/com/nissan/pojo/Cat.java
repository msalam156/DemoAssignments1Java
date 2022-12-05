<<<<<<< HEAD
package com.nissan.pojo;

public class Cat extends Animals {

	public Cat() {}
	
	public Cat(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}
	
	public void saySomething() {
		System.out.println("Cats say meow meow");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "meow";
	}

	@Override
	public double fly() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		System.out.println("Walking with " + super.getNoOfLegs() + " of legs");
//	}
}
=======
package com.nissan.pojo;

public class Cat extends Animals {

	public Cat() {}
	
	public Cat(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}
	
	public void saySomething() {
		System.out.println("Cats say meow meow");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "meow";
	}

	@Override
	public double fly() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		System.out.println("Walking with " + super.getNoOfLegs() + " of legs");
//	}
}
>>>>>>> 03d97f925cf584da65fa9cf807019b741437dbdd
