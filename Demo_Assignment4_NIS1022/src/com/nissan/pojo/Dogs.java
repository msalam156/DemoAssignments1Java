<<<<<<< HEAD
package com.nissan.pojo;

public class Dogs extends Animals {

	public Dogs() {}
	
	public Dogs(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}
	
	public void saySomething() {
		System.out.println("Dogs say Bow Wow");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Bow Wow";
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

public class Dogs extends Animals {

	public Dogs() {}
	
	public Dogs(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}
	
	public void saySomething() {
		System.out.println("Dogs say Bow Wow");
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Bow Wow";
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
