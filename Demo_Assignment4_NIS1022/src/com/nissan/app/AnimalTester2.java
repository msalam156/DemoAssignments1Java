<<<<<<< HEAD
package com.nissan.app;

import java.util.Scanner;

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;

public class AnimalTester2 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			Cat cat = new Cat();
			Dog dog = new Dog();
			
			cat.saySomething();
			dog.saySomething();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
=======
package com.nissan.app;

import java.util.Scanner;

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;

public class AnimalTester2 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			Cat cat = new Cat();
			Dog dog = new Dog();
			
			cat.saySomething();
			dog.saySomething();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
>>>>>>> 03d97f925cf584da65fa9cf807019b741437dbdd
