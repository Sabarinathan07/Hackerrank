package com.javaaid.hackerrank.solutions.thirtydaysofcode;
class Person {
	private int age;
	public Person(int initialAge) {
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
		}
		this.age = initialAge;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");

		} else {
			System.out.println("You are old.");
		}
	}
	public void yearPasses() {
	  this.age++;
	}
}
